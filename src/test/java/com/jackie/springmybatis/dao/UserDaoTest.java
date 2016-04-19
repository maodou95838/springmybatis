package com.jackie.springmybatis.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jackie.springmybatis.domain.User;

public class UserDaoTest {
	private ApplicationContext factory;
	@Before
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext("spring.xml");
	}

	@Test
	public void testInsert() {
		UserDao userDao = (UserDao)factory.getBean("userDao");
		User user = new User();
		user.setName("王宝强");
		user.setCellphone("111111111");
		user.setUserLoginId("wbq");
		userDao.insert(user);
	}

}
