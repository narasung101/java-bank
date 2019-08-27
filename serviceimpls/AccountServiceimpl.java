package com.bitcamp.serviceimpls;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.bitcamp.domains.AccountBean;
import com.bitcamp.services.AccountService;

public class AccountServiceimpl implements AccountService{
	private AccountBean[] accounts; 
	private int count;
	
	private AccountBean accountBean;

	public AccountServiceimpl() {
		accounts = new AccountBean[10];
		count = 0;
		accountBean = new AccountBean();
	}
		
	
	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountnum(createAccountNum());
		acc.setMoney(money+"");
		acc.setToday(findDate());
		accounts[count] = acc;                    
		count++;                                     
				 
	}

	@Override
	public String createAccountNum() {
		Random ran = new Random();
		String t = ran.nextInt(9999)+"-"+ran.nextInt(9999);
		System.out.println("");
		System.out.println(t);
		return t;
		
		/** for(int i=0 ; i<9 ; i++) {
				accoumtNum += (i==4)? "-" : new Random().nextInt(10);
				*/
			}
			

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {

		return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date());
		
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
