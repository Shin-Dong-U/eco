package com.goott.eco.service;

import java.util.*;

import com.goott.eco.common.Criteria;
import com.goott.eco.domain.GoodsVO;

public interface GoodsService {
	public Map<String, Object> goodsList(Criteria cri);
	public void txTest();
	public int insertGoods(GoodsVO vo);
}
