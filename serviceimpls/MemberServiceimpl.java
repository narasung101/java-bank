package com.bitcamp.serviceimpls;

import com.bitcamp.domains.AdminBean;
import com.bitcamp.domains.CustomerBean;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberServiceimpl implements MemberService {
	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int custCount, adminCount;
	
	public MemberServiceimpl() {
		customers = new CustomerBean[10];
		admins = new AdminBean[10];
		custCount = 0;
		adminCount = 0;
	}
	

	@Override
	public void join(CustomerBean param) {
		customers[custCount] = param;
		custCount++;				
	}

	@Override
	public void register(AdminBean param) {
		admins[adminCount] = param;
		adminCount++;
	}

	@Override
	public CustomerBean[] findAllCustomers() {
		
		return customers;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		
		return admins;
	}

	@Override
	public MemberBean[] findByName(String name) {
		
		MemberBean[] members = new MemberBean[10];
		
		return members;
	}

	
	@Override
	public MemberBean findById(String id) {

		MemberBean member = new MemberBean();
		for (int i = 0; i < custCount; i++) {
			if (id.equals(customers[i].getId())) {
				member = customers[i];
				break;
			}

		}
		for (int i = 0; i < adminCount; i++) {
			if (id.equals(customers[i].getId())) {
				member = customers[i];
			}
		}

		return member;
		
	}
	
	@Override
	public boolean login(MemberBean param) {
				
		return findById(param.getId()).getPass()				.equals(param.getPass());
	}

	@Override
	public int countCustomers() {
		 
		return custCount; 
	}

	@Override
	public int countAdmins() {
		
		return adminCount;
	}

	@Override
	public boolean existId(String id) {
		boolean flag = false;
		
		return flag;
	}

	@Override
	public void updatePass(MemberBean param) {
		
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		
		
	}
	
	
	
}
