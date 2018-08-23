package com.byzx.sm.dao;

import java.util.List;

import com.byzx.sm.po.User;

/**
 * dao��ӿڣ��ṩ�������������
 * @author guigu2012
 *
 */
public interface UserDao {
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
