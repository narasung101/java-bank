package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.domains.CustomerBean;
import com.bitcamp.domains.AdminBean;

public interface MemberService {
	void join(CustomerBean param);
	CustomerBean[] findAllCustomers();
	AdminBean[] findAllAdmins();
	MemberBean[] findByName(String name); // 고객, 사원 공용메소드
	MemberBean findById(String id); // 고객, 사원 공용메소드
	boolean login(MemberBean param); // 고객, 사원 공용메소드
	int countCustomers(); // 고객수
	int countAdmins(); // 직원수
	boolean existId(String id);
	void updatePass(MemberBean param);
	void deleteMember(MemberBean param);
}
