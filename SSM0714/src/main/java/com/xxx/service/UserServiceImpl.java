package com.xxx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxx.dao.UserMapper;
import com.xxx.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserById(int id) {
		return userMapper.queryUserById(id);
	}

	@Override
	public User queryUserByName(String name) {
		return userMapper.queryUserByName(name);
	}
}
