package com.journaldev.java.legacy;

import org.jetbrains.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailService {
	private Logger logger = LoggerFactory.getLogger(EmailService.class);


	public void sendEmail(String message, String receiver){
		//logic to send email
		String msg = Utils.getMsg("Email", message, receiver);
		logger.debug (msg);

	}
}
