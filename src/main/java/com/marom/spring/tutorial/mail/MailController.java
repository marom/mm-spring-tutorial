package com.marom.spring.tutorial.mail;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	private MailSender mailSender;

	@RequestMapping("/mail")
	public String sendMail() {
		mailSender.send("abc@example.com", "Some subject", "the content");
		return "Mail sent";
	}

	@Resource
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

}
