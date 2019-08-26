package com.bitcamp.domains;
//계좌: 계좌번호, 거래일, accountNum, today, money
public class AccountBean {
	private String accountnum, today, money;
	
	public void setAccountNum(String accountnum) {
		this.accountnum = accountnum;
	}

	public String getAccountNum() {
		return accountnum;
	}
	
	public void setToday(String today) {
		this.today = today;
	}

	public String getToday() {
		return today;
	}
	
	public void setMoney(String money) {
		this.money = money;
	}

	public String getMoney() {
		return money;
	}

	@Override
	public String toString() {
		// 관리자 : 사번(1234)
		return String.format("", accountnum, today, money);
	}

}
