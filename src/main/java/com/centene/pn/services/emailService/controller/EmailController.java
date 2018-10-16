package com.centene.pn.services.emailService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centene.pn.services.emailService.model.EmailRequestDto;
import com.centene.pn.services.emailService.service.EmailService;

/**
 * The Rest controller responsible for sending out emails.
 * 
 * @author
 *
 */
@RestController
@RequestMapping("/api/v1")
public class EmailController {

	private EmailService emailService;

	@Autowired
	public EmailController(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	/**
	 * Send out email to the recipients.
	 * 
	 * @param requestDto Object containing details about the email.
	 * @return
	 */
	@PostMapping("/mail")
	public String sendMail(@RequestBody EmailRequestDto requestDto) {
		System.out.println("Sending mail.");
		emailService.sendMail(requestDto);
		return "Email Sent successfully.";
	}
}
