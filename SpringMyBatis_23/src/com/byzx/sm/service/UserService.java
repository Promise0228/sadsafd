package com.byzx.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.byzx.sm.dao.UserDao;
import com.byzx.sm.po.User;

public class UserService implements IUserService {
	@Autowired
    private UserDao userDao;
	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userDao.findUsers();
	}

	@Override
	public List<User> findUsersByUserName(User u) {
		// TODO Auto-generated method stub
		return userDao.findUsersByUserName(u);
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
        userDao.addUser(u);
	}

	@Override
	public int updateUser(User u) {
		// TODO Auto-generated method stub
        return userDao.updateUser(u);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
        userDao.deleteUser(id);
	}

}
