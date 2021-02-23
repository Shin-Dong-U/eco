package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

public interface CustMapper {
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo);
}
