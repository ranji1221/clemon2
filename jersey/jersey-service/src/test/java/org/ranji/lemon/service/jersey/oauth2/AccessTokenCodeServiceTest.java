package org.ranji.lemon.service.jersey.oauth2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ranji.lemon.common.core.app.CoreApplication;
import org.ranji.lemon.model.jersey.oauth2.AccessTokenCode;
import org.ranji.lemon.service.jersey.oauth2.prototype.IAccessTokenCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=CoreApplication.class)  //-- 指定Spring-Boot的启动类
public class AccessTokenCodeServiceTest {
	
	@Autowired
	IAccessTokenCodeService atcService;
	
	@Test
	public void testAddAccessTokenCode(){
		AccessTokenCode atc = new AccessTokenCode();
		atc.setCode("234567y");
		atc.setUsername("2ssss");
		atcService.save(atc);
	}
	
}
