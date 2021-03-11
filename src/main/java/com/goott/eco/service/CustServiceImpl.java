package com.goott.eco.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.goott.eco.domain.CustVO;
import com.goott.eco.domain.MemberVO;
import com.goott.eco.mapper.CompanyMapper;
import com.goott.eco.mapper.CustMapper;

import lombok.Setter;

@Service
public class CustServiceImpl implements CustService{

	@Autowired
	private CustMapper custDao;
	
	@Autowired
	private CompanyMapper compDao;
	
	@Setter(onMethod_ = { @Autowired})
	private PasswordEncoder pwEncoder;
	
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
	public MemberVO getCust(MemberVO memberVO) {
		//MemberVO memberVO = new MemberVO();
		//memberVO.setCustVO(custDao.getCust(memberId));
		memberVO.setCustVO(custDao.getCust(memberVO.getCustVO().getMemberId()));
		if(memberVO.getCustVO().getCompany_yn().equals("Y")) {
			memberVO.setCompVO(compDao.getCompany(memberVO.getCustVO().getMemberId()));
		}
		return memberVO;
	}
	
	/* 회원가입 */
	@Override
	public int joinCust(MemberVO memberVO) {
		passwordEncoding(memberVO.getCustVO());
		int ecoCust = custDao.joinCust(memberVO.getCustVO());
		int ecoCustAuth = custDao.joinCustAuth(memberVO.getCustVO().getMemberId());
		
		if(memberVO.getCustVO().getCompany_yn().equals("Y")) {
			System.out.println("custId: "+memberVO.getCompVO().getCust_id());
			memberVO.getCompVO().setCust_id(memberVO.getCustVO().getMemberId());
			//int ecoCompany = compDao.joinCompany(memberVO.getCompVO());
			if(compDao.joinCompany(memberVO.getCompVO())!=1) {return 0;}
			//admin 관리자에서 실행
			//int ecoCompanyAuth = compDao.joinCompanyAuth(memberVO.getCompVO().getCust_id());
		}
		return ecoCust == 1 &ecoCustAuth ==1 ? 1 : 0;
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

	public void passwordEncoding(CustVO custVO) {
		String Encoder=pwEncoder.encode(custVO.getPassword());
		custVO.setPassword(Encoder);
		//custVO.setPassword(passwordEncoder.encode(custVO.getPassword()));
	}

}
