package com.goott.eco.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MileageVO {
	
	public Long mileage_seq;
	public String id;
	public Long order_seq;
	public Long mileage;
	public String memo;
	public String reguser;
	public Timestamp regdate;
	public String edituser;
	public Timestamp editdate; 
/*	
	public MileageVO() {
	}

	public MileageVO(int mileage_seq, String id, int order_seq, int mileage, String memo, String reguser,
			Timestamp regdate, String edituser, Timestamp editdate) {
		super();
		this.mileage_seq = mileage_seq;
		this.id = id;
		this.order_seq = order_seq;
		this.mileage = mileage;
		this.memo = memo;
		this.reguser = reguser;
		this.regdate = regdate;
		this.edituser = edituser;
		this.editdate = editdate;
	}

	public int getMileage_seq() {
		return mileage_seq;
	}

	public void setMileage_seq(int mileage_seq) {
		this.mileage_seq = mileage_seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOrder_seq() {
		return order_seq;
	}

	public void setOrder_seq(int order_seq) {
		this.order_seq = order_seq;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReguser() {
		return reguser;
	}

	public void setReguser(String reguser) {
		this.reguser = reguser;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public String getEdituser() {
		return edituser;
	}

	public void setEdituser(String edituser) {
		this.edituser = edituser;
	}

	public Timestamp getEditdate() {
		return editdate;
	}

	public void setEditdate(Timestamp editdate) {
		this.editdate = editdate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((editdate == null) ? 0 : editdate.hashCode());
		result = prime * result + ((edituser == null) ? 0 : edituser.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memo == null) ? 0 : memo.hashCode());
		result = prime * result + mileage;
		result = prime * result + mileage_seq;
		result = prime * result + order_seq;
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
		MileageVO other = (MileageVO) obj;
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memo == null) {
			if (other.memo != null)
				return false;
		} else if (!memo.equals(other.memo))
			return false;
		if (mileage != other.mileage)
			return false;
		if (mileage_seq != other.mileage_seq)
			return false;
		if (order_seq != other.order_seq)
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
		return "MileageVO [mileage_seq=" + mileage_seq + ", id=" + id + ", order_seq=" + order_seq + ", mileage="
				+ mileage + ", memo=" + memo + ", reguser=" + reguser + ", regdate=" + regdate + ", edituser="
				+ edituser + ", editdate=" + editdate + "]";
	}
*/
	
	
}
