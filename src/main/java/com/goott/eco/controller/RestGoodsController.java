package com.goott.eco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.goott.eco.common.Criteria;
import com.goott.eco.service.GoodsService;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

import com.goott.eco.domain.AttachFileDTO;
import com.goott.eco.domain.CustVO;

@RestController
@RequestMapping("/goods/rest")
@Log4j
public class RestGoodsController {
	
	@Autowired private GoodsService goodsService;

	@GetMapping(value="", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<Map<String, Object>> goodsList(@ModelAttribute Criteria cri) {
		Map<String, Object> goods = goodsService.goodsList(cri);
		System.out.println("@@@list");
		
		return new ResponseEntity<>(goods, HttpStatus.OK);
	}
	
	
	@PostMapping(value="/form/upload/images", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<List<AttachFileDTO>> goodsDetailImagesUpload(HttpServletRequest request, MultipartFile[] uploadFile) {
		List<AttachFileDTO> attachList = new ArrayList<AttachFileDTO>();
		
		String defaultFolder = "c:\\upload\\temp";
		
		String yymmdd = new SimpleDateFormat("yyyyMMdd").format(System.currentTimeMillis());
		String uploadFolder = defaultFolder + "\\" + yymmdd;
		
		for(MultipartFile multipartFile : uploadFile) {
			
			AttachFileDTO attachDTO = new AttachFileDTO();
			
			String uploadFileName = multipartFile.getOriginalFilename();
			String uuid = UUID.randomUUID().toString();
			
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1 );
			uploadFileName = uuid + "_" + uploadFileName;
			
			File saveFile = new File(uploadFolder, uploadFileName);
			
			try {
				File folder = new File(uploadFolder);
				
				if(!folder.exists()) { folder.mkdir(); }
				
				multipartFile.transferTo(saveFile);
				
				boolean isImage = checkImageType(saveFile);
				
				if(isImage) {
					FileOutputStream thumbnail = new FileOutputStream(new File(uploadFolder, "s_" + uploadFileName));
					
					Thumbnailator.createThumbnail(multipartFile.getInputStream(), thumbnail, 100, 100);
					
					thumbnail.close();
				}
				
				attachDTO.setFileName(uploadFileName);
				attachDTO.setUploadPath(uploadFolder);
				attachDTO.setUuid(uuid);
				attachDTO.setImage(isImage);
				
				attachList.add(attachDTO);
			} catch (IllegalStateException | IOException e) {
				//여기에 실패 처리 작성  
				log.error(e.getMessage());
			}
		}
		return new ResponseEntity<>(attachList, HttpStatus.OK);
	}
	
	@PostMapping(value="/temp/call", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<List<AttachFileDTO>> tmpCallTest() {
		System.out.println("@@@@@ testcontroller");
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
		
	
	private boolean checkImageType(File file) {
		
		try {
			String contentType = Files.probeContentType(file.toPath());
			
			return contentType.startsWith("image");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
