package com.marom.spring.tutorial.mail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	private MailSender mailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "Mail sent";
	}

}
