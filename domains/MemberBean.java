package com.bitcamp.domains;

public class MemberBean {
	private String id, pass, name, ssn;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPass(String pass) {
		this.id = pass;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setName(String name) {
		this.id = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSsn(String ssn) {
		this.id = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	@Override
	public String toString() {
		//아이디, 비번, 이름, 주민번호
		return String.format("회원: 아이디%s, 비번%s, 이름%s, 주민번호%s", id, pass, name, ssn);
	}

}
