package com.goott.eco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goott.eco.common.Criteria;
import com.goott.eco.domain.AttachFileDTO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.service.GoodsService;

@RestController
@RequestMapping("/goods/rest/*")
public class RestGoodsController {
		
	@Autowired private GoodsService goodsService;

	@GetMapping(value="", produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Map<String, Object>> goodsList(Criteria cri) {
		Map<String, Object> goods = goodsService.goodsList(cri);
		
		return new ResponseEntity<>(goods, HttpStatus.OK);
	}
	
	//리뷰
	@GetMapping(value="/{goodsSeq}/review", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<Map<String, Object>> getReview(@PathVariable int goodsSeq, @RequestParam int pageNum) {
		Map<String, Object> comment = goodsService.goodsComment(goodsSeq, pageNum);
		return new ResponseEntity<>(comment, HttpStatus.OK);
	}
	
	@PostMapping(value="/{goodsSeq}/review/{goodsCommentSeq}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<Integer> updateReview(HttpServletRequest request 
												, @PathVariable int goodsSeq
												, @RequestBody GoodsVO.GoodsCommentVO commentVO) {
//		System.out.println("@@@@@ update review 하드코딩 삭제해요!!!!@@@@");
//		테스트 완료후 세션 하드코딩 값 삭제!!!. 
		String memberId = (String)request.getSession().getAttribute("memberId");
		if(memberId == null || memberId.equals("")) { return new ResponseEntity<>(HttpStatus.BAD_REQUEST); }
//		String memberId = "kate";
		commentVO.setCust_id(memberId);
		
		int record = goodsService.updateReview(commentVO);
		return record == 1 ? new ResponseEntity<>(HttpStatus.OK)
				:  new ResponseEntity<>(HttpStatus.BAD_REQUEST);//적당한 오류 코드 번호 찾아서 수정 필요.
	}
	
	@PutMapping(value="/{goodsSeq}/review", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<Integer> insertReview(HttpServletRequest request, @PathVariable int goodsSeq
												, @RequestBody GoodsVO.GoodsCommentVO commentVO) {
//		System.out.println("@@@@@ insert review 하드코딩 삭제해요!!!!@@@@");
//		테스트 완료후 세션 하드코딩 값 삭제!!!. 
		String memberId = (String)request.getSession().getAttribute("memberId");
		if(memberId == null || memberId.equals("")) { return new ResponseEntity<>(HttpStatus.BAD_REQUEST); }
//		String memberId = "kate";
		commentVO.setCust_id(memberId);
		
		int record = goodsService.insertReview(commentVO); 
		return record == 1 ? new ResponseEntity<>(HttpStatus.OK)
				:  new ResponseEntity<>(HttpStatus.BAD_REQUEST);//적당한 오류 코드 번호 찾아서 수정 필요.
	}
	
	//업로드 테스트 중 ing
	@PostMapping(value="/form/upload/images", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<List<AttachFileDTO>> goodsDetailImagesUpload(HttpServletRequest request, HttpServletResponse response){
			//, MultipartFile[] uploadFile) {
		System.out.println("@@@@ file upload");
		/*
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
		return new ResponseEntity<>(attachList, HttpStatus.OK);*/
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
