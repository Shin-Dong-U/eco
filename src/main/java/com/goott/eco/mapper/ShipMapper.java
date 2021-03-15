package com.goott.eco.mapper;

import java.util.List;

import com.goott.eco.domain.ShipVO;

public interface ShipMapper {
	
	public int insertShipInfo(ShipVO shipVO);
	
	public List<ShipVO> getPaidShipList();
	
	public int updateShipInfo(ShipVO shipVO);
	
	public List<ShipVO> getShipList(String cust_id);

}
