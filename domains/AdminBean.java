package com.bitcamp.domains;

public class AdminBean {
	private String sabun;

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	public String getSabun() {
		return sabun;
	}

	@Override
	public String toString() {
		// 관리자 : 사번(1234)
		return String.format("", sabun);
	}
}
