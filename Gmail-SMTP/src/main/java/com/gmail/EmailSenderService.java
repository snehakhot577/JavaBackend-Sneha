package com.gmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String to, String subject , String body) {
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("snehavkhot1303@gmail.com");
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(body);
		mailSender.send(msg);
		System.out.println("Mail sent Successfully....."+msg);
		
	}

}
