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
		List<Map<String, Object>> cateList = goodsDao.goodsCategoryList();
		
		resMap.put("goodsList", goodsList);
		resMap.put("page", page);
//		resMap.put("cri", cri);
		
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
	public Map<String, Object> goodsComment(int goodsSeq, int pageNum){
		final int DEFAULT_COMMENT_PAGE_AMOUNT = 5;
		int total = goodsDao.totalCountGoodsComment(goodsSeq);
		PageDTO page = new PageDTO(new Criteria(pageNum, DEFAULT_COMMENT_PAGE_AMOUNT), total);
		
		List<Map<String, Object>> commentList = goodsDao.goodsComment(goodsSeq, page.getCri().getStart());
		
		Map<String, Object> comment = new HashMap<String, Object>();
		comment.put("commentList", commentList);
		comment.put("page", page);
		
		return comment;
	}

	@Override
	public int insertGoods(GoodsVO vo) {
		goodsDao.insertGoods(vo);
		return 0;
	}

}
