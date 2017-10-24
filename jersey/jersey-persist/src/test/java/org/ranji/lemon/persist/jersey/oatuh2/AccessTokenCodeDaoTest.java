package org.ranji.lemon.persist.jersey.oatuh2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranji.lemon.common.core.app.CoreApplication;
import org.ranji.lemon.common.jersey.util.GuidUtil;
import org.ranji.lemon.model.jersey.oauth2.AccessTokenCode;
import org.ranji.lemon.persist.jersey.oauth2.prototype.IAccessTokenCodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=CoreApplication.class)  //-- 指定Spring-Boot的启动类
public class AccessTokenCodeDaoTest {
	
	@Autowired
	IAccessTokenCodeDao accessTokenCode;
	
	@Test
	public void testAddAccessTokenCode(){
		AccessTokenCode atc = new AccessTokenCode();
		atc.setUsername("asdqqfg");
		atc.setClientId(GuidUtil.generateClientId());
		atc.setCode(GuidUtil.generateClientId());
		System.out.println(atc);
		
		accessTokenCode.save(atc);
	}
	
	@Test
	public void testFindAccessTokenCode(){
		AccessTokenCode atc = accessTokenCode.find(1);
		System.out.println(atc);
	}
	
	@Test
	public void testUpdateAccessTokenCode(){
		AccessTokenCode atc = new AccessTokenCode();
		atc.setUsername("werrtt");
		atc.setClientId(GuidUtil.generateClientId());
		atc.setCode(GuidUtil.generateClientId());
		atc.setId(1);
		System.out.println(atc);
		accessTokenCode.update(atc);
	}
}
