package com.centene.pn.services.emailService.service;

import com.centene.pn.services.emailService.model.EmailRequestDto;

public interface EmailService {

	void sendMail(EmailRequestDto requestDto);

}
