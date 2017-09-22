package com.rm.member;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MemberVO {

	private int mseq;
	private String mid;
	private String mname;
	private String mpassword;
	private String memail;
	private Date mregdate;
	private Date mdeletedate;
	private String mdeleteyn;
	private String mresetyn;
	
	public MemberVO() {}

	/**
	 * @return the mseq
	 */
	public int getMseq() {
		return mseq;
	}



	/**
	 * @param mseq the mseq to set
	 */
	public void setMseq(int mseq) {
		this.mseq = mseq;
	}



	/**
	 * @return the mid
	 */
	public String getMid() {
		return mid;
	}



	/**
	 * @param mid the mid to set
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	/**
	 * @return the mpassword
	 */
	public String getMpassword() {
		return mpassword;
	}

	/**
	 * @param mpassword the mpassword to set
	 */
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}



	/**
	 * @return the memail
	 */
	public String getMemail() {
		return memail;
	}



	/**
	 * @param memail the memail to set
	 */
	public void setMemail(String memail) {
		this.memail = memail;
	}



	/**
	 * @return the mregdate
	 */
	public Date getMregdate() {
		return mregdate;
	}



	/**
	 * @param mregdate the mregdate to set
	 */
	public void setMregdate(Date mregdate) {
		this.mregdate = mregdate;
	}



	/**
	 * @return the mdeletedate
	 */
	public Date getMdeletedate() {
		return mdeletedate;
	}



	/**
	 * @param mdeletedate the mdeletedate to set
	 */
	public void setMdeletedate(Date mdeletedate) {
		this.mdeletedate = mdeletedate;
	}



	/**
	 * @return the mdeleteyn
	 */
	public String getMdeleteyn() {
		return mdeleteyn;
	}



	/**
	 * @param mdeleteyn the mdeleteyn to set
	 */
	public void setMdeleteyn(String mdeleteyn) {
		this.mdeleteyn = mdeleteyn;
	}



	/**
	 * @return the mresetyn
	 */
	public String getMresetyn() {
		return mresetyn;
	}



	/**
	 * @param mresetyn the mresetyn to set
	 */
	public void setMresetyn(String mresetyn) {
		this.mresetyn = mresetyn;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
