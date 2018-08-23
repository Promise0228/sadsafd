package com.byzx.sm.service;

import java.util.List;

import com.byzx.sm.po.User;

public interface IUserService {
	//��ѯ�����û���Ϣ
		public List<User> findUsers();
		//�����û���ģ����ѯ��ע�⣬���е���������װ�ڶ����н��д���
		public List<User> findUsersByUserName(User u);
		//����һ���û�
		public void addUser(User u);
		//�����û�ID�޸��û���Ϣ
		public int updateUser(User u);
		//�����û�IDɾ���û���Ϣ
		public void deleteUser(int id);
}
