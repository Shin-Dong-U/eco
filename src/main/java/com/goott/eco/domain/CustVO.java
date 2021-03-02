package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustVO {

	private String memberId;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String addr_post;
	private String addr_city;
	private String addr_detail;
	private String birth;
	private Long sex;
	private String company_yn;
	private String member_yn;
	private Timestamp regDate;
	private String regUser;
	private Timestamp editDate;
	private String editUser;
	private String myTree;
	private Long myMil;
	
/*	
	public CustVO() {
	}


	public CustVO(String memberId, String password, String name, String phone, String email, String addr_post,
			String addr_city, String addr_detail, String birth, Long sex, String company_yn, String member_yn,
			Timestamp regDate, String regUser, Timestamp editDate, String editUser, String myTree, Long myMil) {
		this.memberId = memberId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr_post = addr_post;
		this.addr_city = addr_city;
		this.addr_detail = addr_detail;
		this.birth = birth;
		this.sex = sex;
		this.company_yn = company_yn;
		this.member_yn = member_yn;
		this.regDate = regDate;
		this.regUser = regUser;
		this.editDate = editDate;
		this.editUser = editUser;
		this.myTree = myTree;
		this.myMil = myMil;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddr_post() {
		return addr_post;
	}


	public void setAddr_post(String addr_post) {
		this.addr_post = addr_post;
	}


	public String getAddr_city() {
		return addr_city;
	}


	public void setAddr_city(String addr_city) {
		this.addr_city = addr_city;
	}


	public String getAddr_detail() {
		return addr_detail;
	}


	public void setAddr_detail(String addr_detail) {
		this.addr_detail = addr_detail;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public Long getSex() {
		return sex;
	}


	public void setSex(Long sex) {
		this.sex = sex;
	}


	public String getCompany_yn() {
		return company_yn;
	}


	public void setCompany_yn(String company_yn) {
		this.company_yn = company_yn;
	}


	public String getMember_yn() {
		return member_yn;
	}


	public void setMember_yn(String member_yn) {
		this.member_yn = member_yn;
	}


	public Timestamp getRegDate() {
		return regDate;
	}


	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}


	public String getRegUser() {
		return regUser;
	}


	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}


	public Timestamp getEditDate() {
		return editDate;
	}


	public void setEditDate(Timestamp editDate) {
		this.editDate = editDate;
	}


	public String getEditUser() {
		return editUser;
	}


	public void setEditUser(String editUser) {
		this.editUser = editUser;
	}


	public String getMyTree() {
		return myTree;
	}


	public void setMyTree(String myTree) {
		this.myTree = myTree;
	}


	public Long getMyMil() {
		return myMil;
	}


	public void setMyMil(Long myMil) {
		this.myMil = myMil;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr_city == null) ? 0 : addr_city.hashCode());
		result = prime * result + ((addr_detail == null) ? 0 : addr_detail.hashCode());
		result = prime * result + ((addr_post == null) ? 0 : addr_post.hashCode());
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((company_yn == null) ? 0 : company_yn.hashCode());
		result = prime * result + ((editDate == null) ? 0 : editDate.hashCode());
		result = prime * result + ((editUser == null) ? 0 : editUser.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((member_yn == null) ? 0 : member_yn.hashCode());
		result = prime * result + ((myMil == null) ? 0 : myMil.hashCode());
		result = prime * result + ((myTree == null) ? 0 : myTree.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((regUser == null) ? 0 : regUser.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustVO other = (CustVO) obj;
		if (addr_city == null) {
			if (other.addr_city != null)
				return false;
		} else if (!addr_city.equals(other.addr_city))
			return false;
		if (addr_detail == null) {
			if (other.addr_detail != null)
				return false;
		} else if (!addr_detail.equals(other.addr_detail))
			return false;
		if (addr_post == null) {
			if (other.addr_post != null)
				return false;
		} else if (!addr_post.equals(other.addr_post))
			return false;
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
			return false;
		if (company_yn == null) {
			if (other.company_yn != null)
				return false;
		} else if (!company_yn.equals(other.company_yn))
			return false;
		if (editDate == null) {
			if (other.editDate != null)
				return false;
		} else if (!editDate.equals(other.editDate))
			return false;
		if (editUser == null) {
			if (other.editUser != null)
				return false;
		} else if (!editUser.equals(other.editUser))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (member_yn == null) {
			if (other.member_yn != null)
				return false;
		} else if (!member_yn.equals(other.member_yn))
			return false;
		if (myMil == null) {
			if (other.myMil != null)
				return false;
		} else if (!myMil.equals(other.myMil))
			return false;
		if (myTree == null) {
			if (other.myTree != null)
				return false;
		} else if (!myTree.equals(other.myTree))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (regDate == null) {
			if (other.regDate != null)
				return false;
		} else if (!regDate.equals(other.regDate))
			return false;
		if (regUser == null) {
			if (other.regUser != null)
				return false;
		} else if (!regUser.equals(other.regUser))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CustVO [memberId=" + memberId + ", password=" + password + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", addr_post=" + addr_post + ", addr_city=" + addr_city + ", addr_detail="
				+ addr_detail + ", birth=" + birth + ", sex=" + sex + ", company_yn=" + company_yn + ", member_yn="
				+ member_yn + ", regDate=" + regDate + ", regUser=" + regUser + ", editDate=" + editDate + ", editUser="
				+ editUser + ", myTree=" + myTree + ", myMil=" + myMil + "]";
	}
	
	
*/	
	
}
