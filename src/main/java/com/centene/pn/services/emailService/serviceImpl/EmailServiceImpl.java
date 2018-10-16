package com.centene.pn.services.emailService.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.centene.pn.services.emailService.model.EmailRequestDto;
import com.centene.pn.services.emailService.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	private Environment environment;

	@Autowired
	public EmailServiceImpl(Environment environment) {
		super();
		this.environment = environment;
	}

	@Override
	public void sendMail(EmailRequestDto requestDto) {
		System.out.println(environment.getProperty("mail.smtp.username"));
	}

}
