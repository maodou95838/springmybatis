package com.jackie.springmybatis.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.jackie.springmybatis.dao.UserDao;
import com.jackie.springmybatis.domain.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	public void insert(User user) {
		SqlSession session = this.getSqlSession();
		session.insert("test.insertUser", user);
	}

	public User selectByPrimaryKey(Integer id) {
		SqlSession session = this.getSqlSession();
		User user = session.selectOne("test.selectByPrimaryKey", id);
		return user;
	}
	
	
}
