package com.goott.eco.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.MemberVO;
import com.goott.eco.mapper.CompanyMapper;
import com.goott.eco.mapper.CustMapper;

@Service
public class CustServiceImpl implements CustService{

	@Autowired
	private CustMapper custDao;
	
	@Autowired
	private CompanyMapper compDao;
	
	@Override
	public List<Map<String, Object>> getCustList(Map<String, Object> searchInfo) {
		return custDao.getCustList(searchInfo);
	}

	@Override
	public CustVO getCustId(CustVO custVO) {
		
		return custDao.getCustId(custVO);
	}
	
	/* 로그인 */
	@Override
	public CustVO getCustLogin(CustVO custVO) {
		return custDao.getCustLogin(custVO);
	}
	
	/* 특정 회원 정보 가져오기 */
	@Override
	public MemberVO getCust(String memberId) {
		MemberVO memberVO = new MemberVO();
		memberVO.setCustVO(custDao.getCust(memberId));
		
		if(memberVO.getCustVO().getCompany_yn().equals("Y")) {
			memberVO.setCompVO(compDao.getCompany(memberId));
		}
		return memberVO;
	}
	
	/* 회원가입 */
	@Override
	public int joinCust(MemberVO memberVO) {
		int custValue = custDao.joinCust(memberVO.getCustVO());
		
		if(memberVO.getCustVO().getCompany_yn().equals("Y")) {
			if(compDao.joinCompany(memberVO.getCompVO()) != 1)return 0; 
		}
		
		return custValue;
	}
	
	/* 회원 수정 */
	@Override
	public int modifyCust(MemberVO memberVO) {
		int custValue=custDao.modifyCust(memberVO.getCustVO());
		if(memberVO.getCustVO().getCompany_yn().equals("Y")) {
			//memberVO.getCompVO().setComp_seq(compDao.getCompany_seq(memberVO.getCustVO().getMemberId()));
			if(compDao.modifyCompany(memberVO.getCompVO()) != 1)return 0;
		}
		return custValue;
	}

	/* 회원 탈퇴 */
	@Override
	public int deleteCust(String memberId) {
		return custDao.deleteCust(memberId);
	}


}
