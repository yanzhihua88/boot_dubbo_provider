package com.yzh.boot_dubbo_provider.sql;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import com.yzh.boot_dubbo_api.entity.User;


public class UserDynamicSql {
    
	public String insertUser(User user){
		return new SQL(){{
			INSERT_INTO(" user");
			if(!StringUtils.isEmpty(user.getAge())){
				VALUES("age", "#{age}");
			}
			if(!StringUtils.isEmpty(user.getName())){
				VALUES("name", "#{name}");
			}
		}}.toString();
	}
	
	public String findByName(String name){
		return new SQL(){{
			SELECT( "*");
			FROM("user");
			WHERE(String.format("LOWER(name) = LOWER('%S')", name));
		}}.toString();
	}
	
	public String select(){
		return new SQL(){{
			
		}}.toString();
	}
	
	public String delete(){
		return new SQL(){{
			
		}}.toString();
	}
	
	public String update(){
		return new SQL(){{
			
		}}.toString();
	}
}
