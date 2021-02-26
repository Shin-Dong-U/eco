package com.goott.eco.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.mapper.MileageMapper;

//import lombok.Setter;

@Service
public class MileageServiceImpl implements MileageService{

	
	@Autowired
	private MileageMapper mileageMapper;
	


//	@Override
//	public List<MileageVO> getId(MileageVO mileageVO) {
//		
//		
//		mileageMapper.getId(id);
//		
//		return null;
//	}



	@Override
	public String getId(String id) {
		
		System.out.println("mileageVO 서비스:" + id);
		
		return mileageMapper.getId(id);
	}

	
	
}
