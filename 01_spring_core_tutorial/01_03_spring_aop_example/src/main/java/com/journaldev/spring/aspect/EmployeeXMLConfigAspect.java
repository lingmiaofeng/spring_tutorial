package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeXMLConfigAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeXMLConfigAspect.class);

	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		logger.debug("EmployeeXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			logger.error(String.valueOf(e));
		}
		String pom = "EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value;
		logger.debug(pom);
		return value;
	}
}
