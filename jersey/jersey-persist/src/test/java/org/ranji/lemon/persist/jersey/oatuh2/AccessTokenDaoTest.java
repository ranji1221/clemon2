package org.ranji.lemon.persist.jersey.oatuh2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranji.lemon.common.core.app.CoreApplication;
import org.ranji.lemon.common.jersey.util.GuidUtil;
import org.ranji.lemon.model.jersey.oauth2.AccessToken;
import org.ranji.lemon.persist.jersey.oauth2.prototype.IAccessTokenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=CoreApplication.class)  //-- 指定Spring-Boot的启动类
public class AccessTokenDaoTest {
	
	@Autowired
	IAccessTokenDao accessToken;
	
	@Test
	public void testAddAccessToken(){
		AccessToken at = new AccessToken();
		at.setUsername("asd1fg");
		at.setClientId(GuidUtil.generateClientId());
		at.setRefreshToken(GuidUtil.generateClientId());
		System.out.println(at);
		
		accessToken.save(at);
	}
	
	@Test
	public void testFindAccessToken(){
		AccessToken at = accessToken.find(1);
		System.out.println(at);
	}
	
	@Test
	public void testUpdateAccessToken(){
		AccessToken at = new AccessToken();
		at.setUsername("werrtt");
		at.setClientId(GuidUtil.generateClientId());
		at.setRefreshToken(GuidUtil.generateClientId());
		at.setId(1);
		System.out.println(at);
		accessToken.update(at);
	}
}
