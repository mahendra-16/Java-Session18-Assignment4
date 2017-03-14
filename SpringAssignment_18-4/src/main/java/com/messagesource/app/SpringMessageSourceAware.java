package com.messagesource.app;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMessageSourceAware {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		HelloController coin = (HelloController) context.getBean(HelloController.class);
		
		coin.MessageService();
		
		String name = context.getMessage("first.name", new Object[]{28, "http://www.acadgild.com/"}, Locale.US);
		
		System.out.println("Person name (English) : " + name);
		
		String nameFrench = context.getMessage("first.name", new Object[]{28, "http://www.acadgild.com/"}, Locale.US);
		
		System.out.println("Person name (French) : " + nameFrench);
		
	}

}
