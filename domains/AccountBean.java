package com.bitcamp.domains;
//계좌: 계좌번호, 거래일, accountNum, today, money
public class AccountBean {
	private String accountnum, today, money;
	

	public String getAccountnum() {
		return accountnum;
	}


	public void setAccountnum(String accountnum) {
		this.accountnum = accountnum;
	}



	public String getToday() {
		return today;
	}



	public void setToday(String today) {
		this.today = today;
	}


	public String getMoney() {
		return money;
	}


	public void setMoney(String money) {
		this.money = money;
	}


	@Override
	public String toString() {
		return "회원 [accountnum=" + accountnum + ", today=" + today + ", money=" + money + "]";
	}
	
	


	
	}


