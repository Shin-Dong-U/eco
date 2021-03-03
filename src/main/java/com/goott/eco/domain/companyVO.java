package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class companyVO {

	private long comp_seq;
	private String cust_id;
	private String comp_name;
	private String corp_num;
	private String addr_post;
	private String addr_city;
	private String addr_detail;
	private String confirm_yn;
	private Timestamp regdate;
	private String reguser;
	private Timestamp editdate;
	private String edituser;
	private String memo;
	
	
	
	public long getComp_seq() {
		return comp_seq;
	}
	public void setComp_seq(long comp_seq) {
		this.comp_seq = comp_seq;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public String getCorp_num() {
		return corp_num;
	}
	public void setCorp_num(String corp_num) {
		this.corp_num = corp_num;
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
	public String getConfirm_yn() {
		return confirm_yn;
	}
	public void setConfirm_yn(String confirm_yn) {
		this.confirm_yn = confirm_yn;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getReguser() {
		return reguser;
	}
	public void setReguser(String reguser) {
		this.reguser = reguser;
	}
	public Timestamp getEditdate() {
		return editdate;
	}
	public void setEditdate(Timestamp editdate) {
		this.editdate = editdate;
	}
	public String getEdituser() {
		return edituser;
	}
	public void setEdituser(String edituser) {
		this.edituser = edituser;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr_city == null) ? 0 : addr_city.hashCode());
		result = prime * result + ((addr_detail == null) ? 0 : addr_detail.hashCode());
		result = prime * result + ((addr_post == null) ? 0 : addr_post.hashCode());
		result = prime * result + ((comp_name == null) ? 0 : comp_name.hashCode());
		result = prime * result + (int) (comp_seq ^ (comp_seq >>> 32));
		result = prime * result + ((confirm_yn == null) ? 0 : confirm_yn.hashCode());
		result = prime * result + ((corp_num == null) ? 0 : corp_num.hashCode());
		result = prime * result + ((cust_id == null) ? 0 : cust_id.hashCode());
		result = prime * result + ((editdate == null) ? 0 : editdate.hashCode());
		result = prime * result + ((edituser == null) ? 0 : edituser.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + ((regdate == null) ? 0 : regdate.hashCode());
		result = prime * result + ((reguser == null) ? 0 : reguser.hashCode());
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
		companyVO other = (companyVO) obj;
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
		if (comp_name == null) {
			if (other.comp_name != null)
				return false;
		} else if (!comp_name.equals(other.comp_name))
			return false;
		if (comp_seq != other.comp_seq)
			return false;
		if (confirm_yn == null) {
			if (other.confirm_yn != null)
				return false;
		} else if (!confirm_yn.equals(other.confirm_yn))
			return false;
		if (corp_num == null) {
			if (other.corp_num != null)
				return false;
		} else if (!corp_num.equals(other.corp_num))
			return false;
		if (cust_id == null) {
			if (other.cust_id != null)
				return false;
		} else if (!cust_id.equals(other.cust_id))
			return false;
		if (editdate == null) {
			if (other.editdate != null)
				return false;
		} else if (!editdate.equals(other.editdate))
			return false;
		if (edituser == null) {
			if (other.edituser != null)
				return false;
		} else if (!edituser.equals(other.edituser))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (regdate == null) {
			if (other.regdate != null)
				return false;
		} else if (!regdate.equals(other.regdate))
			return false;
		if (reguser == null) {
			if (other.reguser != null)
				return false;
		} else if (!reguser.equals(other.reguser))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "CompanyVO [comp_seq=" + comp_seq + ", cust_id=" + cust_id + ", comp_name=" + comp_name + ", corp_num="
				+ corp_num + ", addr_post=" + addr_post + ", addr_city=" + addr_city + ", addr_detail=" + addr_detail
				+ ", confirm_yn=" + confirm_yn + ", regdate=" + regdate + ", reguser=" + reguser + ", editdate="
				+ editdate + ", edituser=" + edituser + ", memo=" + memo + "]";
	}
	
	
}
