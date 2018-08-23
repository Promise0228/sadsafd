package com.byzx.sm.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.byzx.sm.po.User;
import com.byzx.sm.service.IUserService;

public class UserTest {
	private ApplicationContext context;
	private IUserService service;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("spring-bean.xml");
		service = (IUserService) context.getBean("userService");
	}

	// ��ѯ�����û���Ϣ
	@Test
	public void findUsers() {
       List<User> users = service.findUsers();
       System.out.println(users.toString());
	}

	// �����û���ģ����ѯ��ע�⣬���е���������װ�ڶ����н��д���
	@Test
	public void findUsersByUserName() {

	}

	// ����һ���û�
	@Test
	public void addUser() {

	}

	// �����û�ID�޸��û���Ϣ
	@Test
	public void updateUser() {
		User u = new User();
		u.setId(55);
		u.setUsername("��һ��");
		//id:0-�޸�ʧ�ܣ�1-�޸ĳɹ�
        int id =service.updateUser(u);
        System.out.println(id);
	}

	// �����û�IDɾ���û���Ϣ
	@Test
	public void deleteUser() {

	}
}
