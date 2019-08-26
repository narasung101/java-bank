package com.bitcamp.domains;

public class CustomerBean {
	private String credit;
	
	public void setCredit(String credit) {
		this.credit = credit;
	}
	
	public String getCredit() {
		return credit;
	}
	
	@Override
	public String toString() {
		// 고객: 신용도 1등급
		return String.format("", credit);
	}

}
