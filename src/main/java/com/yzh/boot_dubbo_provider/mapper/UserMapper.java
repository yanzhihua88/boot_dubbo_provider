package com.yzh.boot_dubbo_provider.mapper;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.yzh.boot_dubbo_api.entity.User;
import com.yzh.boot_dubbo_provider.sql.UserDynamicSql;

@Mapper
public interface UserMapper {

	@InsertProvider(method = "insertUser", type = UserDynamicSql.class)
	int insertUser(User user);

	@SelectProvider(method = "findByName", type = UserDynamicSql.class)
	List<User> findByName(String name);
	
	@SelectProvider(method = "select", type = UserDynamicSql.class)
	List<User> select(String sellerCode);

	// 插入用户权限
	@DeleteProvider(method = "delete", type = UserDynamicSql.class)
	int delete(int id);

	// 修改密码
	@UpdateProvider(method = "update", type = UserDynamicSql.class)
	int update(User user);
}