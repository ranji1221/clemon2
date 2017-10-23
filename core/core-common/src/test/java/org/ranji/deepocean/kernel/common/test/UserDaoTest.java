package org.ranji.deepocean.kernel.common.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranji.lemon.common.core.app.CoreApplication;
import org.ranji.lemon.common.core.model.User;
import org.ranji.lemon.common.core.persist.prototype.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=CoreApplication.class)  //-- 指定Spring-Boot的启动类
public class UserDaoTest {
	
	@Autowired
	private IUserDao userDao;
	
	@Test
	public void testFindUser(){
		User u = userDao.find(20);
		System.out.println(u);
	}
}
