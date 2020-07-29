package com.xxx.service;

import com.xxx.pojo.User;

public interface UserService {
	public User queryUserById(int id);

    User queryUserByName(String name);
}
