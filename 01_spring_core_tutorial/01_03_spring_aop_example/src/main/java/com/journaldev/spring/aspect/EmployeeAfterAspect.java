package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAfterAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeAfterAspect.class);

	@After("args(name)")
	public void logStringArguments(String name){
		String pom= "Running After Advice. String argument passed="+name;
		logger.debug(pom);
	}
	
	@AfterThrowing("within(com.journaldev.spring.model.Employee)")
	public void logExceptions(JoinPoint joinPoint){
		String pom = "Exception thrown in Employee Method="+joinPoint.toString();
		logger.debug(pom);
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString){

		String pom = "getNameReturningAdvice executed. Returned String="+returnString;
		logger.debug(pom);
	}
	
}
