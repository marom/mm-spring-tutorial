package com.marom.spring.tutorial.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	private MailSender mailSender;

	@Autowired
	public MailController(@Qualifier("smtpMailSender") MailSender mailSender) {
		super();
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "Mail sent";
	}

}
