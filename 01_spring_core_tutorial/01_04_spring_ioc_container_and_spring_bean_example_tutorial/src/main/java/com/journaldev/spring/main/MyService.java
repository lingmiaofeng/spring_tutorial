package com.journaldev.spring.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class MyService {
	private static Logger logger = LoggerFactory.getLogger(MyService.class);

	public void log(String msg){

		String mess = new Date()+"::"+msg;
		logger.info(mess);
	}
}
