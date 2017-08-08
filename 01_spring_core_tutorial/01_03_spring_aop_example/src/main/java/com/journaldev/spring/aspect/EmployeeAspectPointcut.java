package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAspectPointcut {
	private Logger logger = LoggerFactory.getLogger(EmployeeAspectPointcut.class);

	@Before("getNamePointcut()")
	public void loggingAdvice(){
		logger.debug("Executing loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice(){
		logger.debug("Executing secondAdvice on getName()");
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){
		//It's only example
	}
	
	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		logger.debug("Before executing service method");
	}
	
	//Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.journaldev.spring.service.*)")
	public void allMethodsPointcut(){
		//It's only example
	}
	
}
