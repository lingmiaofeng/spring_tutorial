package com.journaldev.java.dependencyinjection.service;

import org.jetbrains.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSServiceImpl implements MessageService {

	private Logger logger = LoggerFactory.getLogger(SMSServiceImpl.class);


	public void sendMessage(String message, String receiver) {
		//logic to send email
		String msg = Utils.getMsg("SMS",message, receiver);
		logger.debug (msg);

	}

}
