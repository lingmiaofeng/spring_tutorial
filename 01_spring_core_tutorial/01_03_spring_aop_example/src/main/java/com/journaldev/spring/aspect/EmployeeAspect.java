package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeAspect.class);

	@Before("execution(public String getName())")
	public void getNameAdvice(){

		logger.debug("Executing Advice on getName()");
	}
	
	@Before("execution(* com.journaldev.spring.service.*.get*())")
	public void getAllAdvice(){

		logger.debug("Service method getter called");
	}
}
