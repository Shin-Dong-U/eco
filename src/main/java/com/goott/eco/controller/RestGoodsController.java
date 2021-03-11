package com.goott.eco.controller;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.goott.eco.domain.CustVO;

@RestController
@RequestMapping("/goods/rest")
@Log4j
public class RestGoodsController {
		@Autowired
		private GoodsService goodsService;

	@GetMapping(value="", produces = "application/json; charset=UTF-8")	
	public ResponseEntity<Map<String, Object>> goodsList(@ModelAttribute Criteria cri) {
		Map<String, Object> goods = goodsService.goodsList(cri);
		System.out.println("@@@list");
		
		return new ResponseEntity<>(goods, HttpStatus.OK);
	}
	
	@PostMapping(value="/form/upload/images")//, produces = "text/plain;charset=utf-8")	
	public void goodsDetailImagesUpload(MultipartFile[] uploadFiles) {
		System.out.println("@@@@@@@@@@@@");
		String uploadFolder = "C:\\upload";
		
		for(MultipartFile multipartFile : uploadFiles) {
			System.out.println("file name : " + multipartFile.getOriginalFilename());
			System.out.println("file size : " + multipartFile.getSize());
			
			//이 라인에 코드 추가 ex) yyyymmdd hhmmss sss + filename 
			String uploadFileName = multipartFile.getOriginalFilename();
			
			uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1 );
			System.out.println("only filename : " + uploadFileName);
			
			File saveFile = new File(uploadFolder, uploadFileName);
			
			try {
				multipartFile.transferTo(saveFile);
			} catch (IllegalStateException | IOException e) {
				log.error(e.getMessage());
				//여기에 실패 처리 작성  
			}
			
		}
		
//		return new ResponseEntity<>("kkk", HttpStatus.OK);
	}
		
	
	
}
