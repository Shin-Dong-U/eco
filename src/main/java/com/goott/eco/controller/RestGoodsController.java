package com.goott.eco.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.goott.eco.common.Criteria;
import com.goott.eco.service.GoodsService;

import lombok.extern.log4j.Log4j;
import net.coobird.thumbnailator.Thumbnailator;

import com.goott.eco.domain.AttachFileDTO;
import com.goott.eco.domain.GoodsVO;

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
		if(memberId == null || memberId.equals("")) { new ResponseEntity<>(HttpStatus.BAD_REQUEST); }
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
		if(memberId == null || memberId.equals("")) { new ResponseEntity<>(HttpStatus.BAD_REQUEST); }
//		String memberId = "kate";
		commentVO.setCust_id(memberId);
		
		int record = goodsService.insertReview(commentVO); 
		return record == 1 ? new ResponseEntity<>(HttpStatus.OK)
				:  new ResponseEntity<>(HttpStatus.BAD_REQUEST);//적당한 오류 코드 번호 찾아서 수정 필요.
	}
	
	//업로드 테스트 중 ing
	@PostMapping(value="/form/upload/images")//, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public ResponseEntity<String> goodsDetailImagesUpload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("@@@@@@@@@@@@@@@@uplolad images");
		
		//파일정보
		String sFileInfo = "";
		//파일명을 받는다 - 일반 원본파일명
		String filename = request.getHeader("file-name");
		//파일 확장자
		String filename_ext = filename.substring(filename.lastIndexOf(".")+1);
		//확장자를소문자로 변경
		filename_ext = filename_ext.toLowerCase();
		//최종파일경로 + 파일명
		String rlFileNm = "";
			
		//이미지 검증 배열변수
		String[] allow_file = {"jpg","png","bmp","gif"};

		//돌리면서 확장자가 이미지인지 
		int cnt = 0;
		for(int i=0; i<allow_file.length; i++) {
			if(filename_ext.equals(allow_file[i])){
				cnt++;
			}
		}

		//이미지가 아님
		if(cnt == 0) {
//			out.println("NOTALLOW_"+filename);
			System.out.println("NOTALLOW");
		} else {
			//이미지이므로 신규 파일로 디렉토리 설정 및 업로드	
			//파일 기본경로
//			String dftFilePath = request.getServletContext().getRealPath("/");
			String dftFilePath = "c:\\upload\\temp\\";
			//파일 기본경로 _ 상세경로
			String filePath = dftFilePath + "editor" + File.separator +"multiupload" + File.separator;
			File file = new File(filePath);
			
			if(!file.exists()) { file.mkdirs(); }
			
			String realFileNm = "";
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			String today= formatter.format(new java.util.Date());
			realFileNm = today+UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));
			rlFileNm = filePath + realFileNm;
			///////////////// 서버에 파일쓰기 ///////////////// 
			InputStream is = request.getInputStream();
			OutputStream os=new FileOutputStream(rlFileNm);
			int numRead;
			byte b[] = new byte[Integer.parseInt(request.getHeader("file-size"))];
			
			while((numRead = is.read(b,0,b.length)) != -1){
				os.write(b,0,numRead);
			}
			
			if(is != null) {
				is.close();
			}
			os.flush();
			os.close();
			///////////////// 서버에 파일쓰기 /////////////////
	
			// 정보 출력
			sFileInfo += "&bNewLine=true";
			//sFileInfo += "&sFileName="+ realFileNm;;
			// img 태그의 title 속성을 원본파일명으로 적용시켜주기 위함
			sFileInfo += "&sFileName="+ filename;
//			sFileInfo += "&sFileURL=" + "/editor/multiupload/" + realFileNm;
			sFileInfo += "&sFileURL=" + "/upload/img/editor/multiupload/" + realFileNm;
			
		
			}
		
		return new ResponseEntity<>(sFileInfo, HttpStatus.OK);
		
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
