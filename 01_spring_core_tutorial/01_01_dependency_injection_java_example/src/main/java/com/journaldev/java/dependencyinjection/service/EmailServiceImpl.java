package com.journaldev.java.dependencyinjection.service;


import org.jetbrains.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailServiceImpl implements MessageService {

	private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);

	public void sendMessage(String message, String receiver) {

		//logic to send email


		String msg = Utils.getMsg("Email",message, receiver);
		logger.debug (msg);

	}

}
