package com.byzx.sm.dao;

import java.util.List;

import com.byzx.sm.po.User;

/**
 * dao层接口：提供方法给外面访问
 * @author guigu2012
 *
 */
public interface UserDao {
	//查询所有用户信息
	public List<User> findUsers();
	//根据用户名模糊查询，注意，所有的条件都封装在对象中进行传递
	public List<User> findUsersByUserName(User u);
	//新增一个用户
	public void addUser(User u);
	//根据用户ID修改用户信息
	public int updateUser(User u);
	//根据用户ID删除用户信息
	public void deleteUser(int id);

}
