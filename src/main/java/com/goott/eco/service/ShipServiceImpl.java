package com.goott.eco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.ShipVO;
import com.goott.eco.mapper.ShipMapper;

import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class ShipServiceImpl implements ShipService {

	private ShipMapper shipMapper;
	
	@Autowired
	public ShipServiceImpl(ShipMapper shipMapper) {
		this.shipMapper = shipMapper;
	}

	@Override
	public int insertShipInfo(ShipVO shipVO) {
		
		return shipMapper.insertShipInfo(shipVO);
	}

	@Override
	public List<ShipVO> getPaidShipList() {
		 
		return shipMapper.getPaidShipList();
	}

	@Override
	public int updateShipInfo(ShipVO shipVO) {
		log.info("check"+shipVO);
		return shipMapper.updateShipInfo(shipVO);
	}

	@Override
	public List<ShipVO> getShipList(String cust_id) {
		log.info("check"+cust_id);
		return shipMapper.getShipList(cust_id);
	}


	

}
