package com.marom.spring.tutorial.mail;

public interface MailSender {

	void send(String to, String subject, String body); 
}
