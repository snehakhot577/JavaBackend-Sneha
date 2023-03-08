package com.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class GmailSmtpApplication {
	
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(GmailSmtpApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class) 
	public void sendEmail() {
		
		senderService.sendEmail("snehavkhot1303@gmail.com", "THIS IS SUBJECT OF EMAIL", "THIS IS BODY OF EMAIL");
	}
}
