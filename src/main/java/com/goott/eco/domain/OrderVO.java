package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
	private Long order_seq;
	private String cust_id;
	private String paied_yn;
	private Timestamp regDate;
	private String regUser;
	private Timestamp editDate;
	private String editUser;
	private int status;
	private String ori_number;
	
	@Override
	public String toString() {
		return "OrderVO [order_seq=" + order_seq + ", cust_id=" + cust_id + ", paied_yn=" + paied_yn + ", regDate="
				+ regDate + ", regUser=" + regUser + ", editDate=" + editDate + ", editUser=" + editUser + ", status="
				+ status + ", ori_number=" + ori_number + "]";
	}

	public Long getOrder_seq() {
		return order_seq;
	}

	public void setOrder_seq(Long order_seq) {
		this.order_seq = order_seq;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getPaied_yn() {
		return paied_yn;
	}

	public void setPaied_yn(String paied_yn) {
		this.paied_yn = paied_yn;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getOri_number() {
		return ori_number;
	}

	public void setOri_number(String ori_number) {
		this.ori_number = ori_number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cust_id == null) ? 0 : cust_id.hashCode());
		result = prime * result + ((editDate == null) ? 0 : editDate.hashCode());
		result = prime * result + ((editUser == null) ? 0 : editUser.hashCode());
		result = prime * result + ((order_seq == null) ? 0 : order_seq.hashCode());
		result = prime * result + ((ori_number == null) ? 0 : ori_number.hashCode());
		result = prime * result + ((paied_yn == null) ? 0 : paied_yn.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((regUser == null) ? 0 : regUser.hashCode());
		result = prime * result + status;
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
		OrderVO other = (OrderVO) obj;
		if (cust_id == null) {
			if (other.cust_id != null)
				return false;
		} else if (!cust_id.equals(other.cust_id))
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
		if (order_seq == null) {
			if (other.order_seq != null)
				return false;
		} else if (!order_seq.equals(other.order_seq))
			return false;
		if (ori_number == null) {
			if (other.ori_number != null)
				return false;
		} else if (!ori_number.equals(other.ori_number))
			return false;
		if (paied_yn == null) {
			if (other.paied_yn != null)
				return false;
		} else if (!paied_yn.equals(other.paied_yn))
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
		if (status != other.status)
			return false;
		return true;
	}
	
	
}
