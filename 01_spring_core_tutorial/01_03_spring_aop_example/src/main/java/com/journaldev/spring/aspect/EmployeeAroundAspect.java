package com.journaldev.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EmployeeAroundAspect {

	private Logger logger = LoggerFactory.getLogger(EmployeeAroundAspect.class);

	@Around("execution(* com.journaldev.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		logger.debug("Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();

		} catch (Throwable e) {
git add *			logger.error(String.valueOf(e));
		}

		String pom="After invoking getName() method. Return value="+value;
		logger.debug(pom);
		return value;
	}
}
