package com.messagesource.app;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class HelloController implements MessageSourceAware {

	private MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		
		this.messageSource = messageSource;
	}

	public void MessageService(){
		
		String englishMessage = messageSource.getMessage("first.name", new Object[]{28, "http://www.acadgild.com/"}, Locale.US);
		
		System.out.println("Person name (english) : " + englishMessage);

		String frenchMessage = messageSource.getMessage("first.name", new Object[]{28, "http://www.acadgild.com/"}, Locale.FRANCE);
		
		System.out.println("Person name (french) : " + frenchMessage);
		
		
	}
	
	
	
	
}
