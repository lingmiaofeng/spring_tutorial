package com.journaldev.spring.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeXMLConfigAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeXMLConfigAspect.class);

	public Object employeeAroundAdvice(){
		logger.debug("EmployeeXMLConfigAspect:: Before invoking getName() method");
		Object value = "TEST";

		String pom = "EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value;
		logger.debug(pom);
		return value;
	}
}
