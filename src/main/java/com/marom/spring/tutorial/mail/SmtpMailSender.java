package com.marom.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smtp")
public class SmtpMailSender implements MailSender {

	private static final Log log = LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		log.info("Sending SMTP mail to " + to);
		log.info("Subject: " + subject);
		log.info("Body: " + body);
	}

}
