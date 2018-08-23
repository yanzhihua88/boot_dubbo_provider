package com.yzh.boot_dubbo_provider;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yzh.boot_dubbo_api.entity.User;
import com.yzh.boot_dubbo_provider.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDubboProviderApplicationTests {

	
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void contextLoads() {
		System.out.println(123456);
	}
	
	@Test
	public void test() {
		User user = new User();
		user.setAge(20);
		user.setName("kiki");
		System.out.println("=============name : " + user.getName());
		userMapper.insertUser(user);
		System.out.println("=============size : " );
		List<User> users = userMapper.findByName(user.getName());
		
		System.out.println("=============size : " + users.size());
	}

}
