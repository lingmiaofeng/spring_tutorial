package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAnnotationAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeAnnotationAspect.class);

	@Before("@annotation(com.journaldev.spring.aspect.Loggable)")
	public void myAdvice(){
		logger.debug("Executing myAdvice!!");
	}
}
