package com.xxx.service;

import java.util.List;

import com.xxx.pojo.User;

public interface UserService {
	public User queryUserById(int id);

    User queryUserByName(String name);

    User userCheck(User user);

    int addUser(User user);

    int updateUser(User user);
}
