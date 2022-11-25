package com.jap.demo;

import com.jap.demo.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BejC1S4SpringBootPc1Application {

	private static MessageService messageService;
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BejC1S4SpringBootPc1Application.class, args);
		messageService = (MessageService) context.getBean("messageService");
		String msg = messageService.helloWorld();
		System.out.println(msg);
	}

}
