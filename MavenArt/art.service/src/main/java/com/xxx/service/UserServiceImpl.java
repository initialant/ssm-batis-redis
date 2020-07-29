package com.xxx.service;

import com.xxx.dao.UserMapper;
import com.xxx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryUserById( int id) {
		return userMapper.queryUserById(id);
	}

	@Override
	public User queryUserByName( String name) {
		return userMapper.queryUserByName(name);
	}

	@Override
	public User userCheck( User user) {
		return userMapper.loginCheck(user);
	}

	@Override
	public int addUser( User user) {
		return userMapper.addUser(user);
	}

	@Override
	public int updateUser( User user) {
		return userMapper.updateUser(user);
	}
}
