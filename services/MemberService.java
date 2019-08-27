package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.domains.CustomerBean;
import com.bitcamp.domains.AdminBean;

public interface MemberService {
	public void join(CustomerBean param);
	public void register(AdminBean param);
	public CustomerBean[] findAllCustomers();
	public AdminBean[] findAllAdmins();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id); 
	public boolean login(MemberBean param);
	public int countCustomers(); 
	public int countAdmins(); 
	//public void register()
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);
}
