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

	// 查询所有用户信息
	@Test
	public void findUsers() {
       List<User> users = service.findUsers();
       System.out.println(users.toString());
	}

	// 根据用户名模糊查询，注意，所有的条件都封装在对象中进行传递
	@Test
	public void findUsersByUserName() {

	}

	// 新增一个用户
	@Test
	public void addUser() {

	}

	// 根据用户ID修改用户信息
	@Test
	public void updateUser() {
		User u = new User();
		u.setId(55);
		u.setUsername("左一磊");
		//id:0-修改失败，1-修改成功
        int id =service.updateUser(u);
        System.out.println(id);
	}

	// 根据用户ID删除用户信息
	@Test
	public void deleteUser() {

	}
}
