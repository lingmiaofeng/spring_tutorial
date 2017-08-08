package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAspectJoinPoint {

	private Logger logger = LoggerFactory.getLogger(EmployeeAspectJoinPoint.class);

	@Before("execution(public void com.journaldev.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){

		String join = joinPoint.toString();
		String pom = "Before running loggingAdvice on method="+join;
		logger.debug(pom);

		pom = "Agruments Passed=" + Arrays.toString(joinPoint.getArgs());
		logger.debug( pom);

	}
	
	//Advice arguments, will be applied to bean methods with single String argument
	@Before("args(name)")
	public void logStringArguments(String name){

		String pom = "String argument passed="+name;
		logger.debug(pom);
	}
}
