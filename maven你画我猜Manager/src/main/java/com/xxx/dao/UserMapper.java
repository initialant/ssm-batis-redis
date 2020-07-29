package com.xxx.dao;

import java.util.List;

import com.xxx.pojo.User;

public interface UserMapper {
	
	public User queryUserById(int id);
	
	public List<User> queryUser();

	User queryUserByName(String name);

	User loginCheck(User user);

	int addUser(User user);

	int updateUser(User user);



}

