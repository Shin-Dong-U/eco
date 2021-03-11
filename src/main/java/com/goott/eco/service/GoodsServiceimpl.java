package com.goott.eco.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goott.eco.common.Criteria;
import com.goott.eco.common.PageDTO;
import com.goott.eco.domain.GoodsVO;
import com.goott.eco.mapper.GoodsMapper;

@Transactional
@Service
public class GoodsServiceimpl implements GoodsService{

	@Autowired private GoodsMapper goodsDao; 
	
	@Override
	public void txTest() {
		Map<String, Object> goodMap = new HashMap<String, Object>();
		goodMap.put("no", 1);
		goodMap.put("val", "1");
		Map<String, Object> badMap = new HashMap<String, Object>();
		badMap.put("no", 2);
		badMap.put("val", "555555555555555555555555555555555555555555555151513153111");
		goodsDao.test(goodMap);
		goodsDao.test(badMap);
	}
	
	@Override
	public Map<String, Object> goodsList(Criteria cri) {
		Map<String, Object> resMap = new HashMap<>();
		
		int cnt = goodsDao.totalCountGoodsList(cri);
		
		PageDTO page = new PageDTO(cri, cnt);

		List<Map<String, Object>> goodsList = goodsDao.goodsList(cri);
		
		resMap.put("goodsList", goodsList);
		resMap.put("page", page);
		resMap.put("cri", cri);
		
		return resMap;
	}
	
	@Override
	public Map<String, Object> goodsDetail(int goodsSeq){
		Map<String, Object> goods = new HashMap<String, Object>();
		goods.put("goodsDetail", goodsDao.goodsDetail(goodsSeq));
		goods.put("thumbList", goodsDao.goodsDetailThumbImg(goodsSeq));
		goods.put("imgList", goodsDao.goodsDetailImg(goodsSeq));
		goods.put("optionList", goodsDao.goodsReqOption(goodsSeq));
		return goods;
	}
	
	@Override
	public List<Map<String, Object>> goodsComment(int goodsSeq, int start){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("goods_seq", goodsSeq);
		param.put("start", start);
		
		return goodsDao.goodsComment(param);
	}

	@Override
	public int insertGoods(GoodsVO vo) {
		goodsDao.insertGoods(vo);
		return 0;
	}

}
