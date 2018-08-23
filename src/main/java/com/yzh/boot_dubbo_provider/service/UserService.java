package com.yzh.boot_dubbo_provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzh.boot_dubbo_api.api.IUserService;
import com.yzh.boot_dubbo_api.entity.User;
import com.yzh.boot_dubbo_provider.mapper.UserMapper;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int insertUser(User user) {
		
		System.out.println("=============name : " + user.getName());
		
		return userMapper.insertUser(user);

	}

	@Override
	public List<User> findByName(String name) {
		
		List<User> users = userMapper.findByName(name);

		System.out.println("=============size : " + users.size());
		
		return users;
	}

}
