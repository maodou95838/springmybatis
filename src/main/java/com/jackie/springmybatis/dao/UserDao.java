package com.jackie.springmybatis.dao;

import com.jackie.springmybatis.domain.User;

/**
 * 用户dao接口
 * 
 * @author Jackie
 *
 */
public interface UserDao {
	void insert(User user);
	
	User selectByPrimaryKey(Integer id);
}
