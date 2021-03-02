package com.goott.eco.service;

import java.util.*;

public interface GoodsService {
	public List<Map<String, Object>> getGoodsList(Map<String, Object> search);
	public void txTest();
}
