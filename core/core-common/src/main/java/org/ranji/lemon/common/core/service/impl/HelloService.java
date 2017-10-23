package org.ranji.lemon.common.core.service.impl;

import org.ranji.lemon.common.core.service.prototype.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService{

	@Override
	public void sayHello() {
		System.out.println("hello world");
	}
}
