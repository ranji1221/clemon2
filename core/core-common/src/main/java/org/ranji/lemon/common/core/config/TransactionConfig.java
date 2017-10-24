package org.ranji.lemon.common.core.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class TransactionConfig {
	@Autowired
	private DataSourceTransactionManager transactionManager;
	
	@Bean
	public BeanNameAutoProxyCreator txProxy()
}
