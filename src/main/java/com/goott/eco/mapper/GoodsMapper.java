package com.goott.eco.mapper;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search);
}
