package com.journaldev.spring.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {
	private static Logger logger = LoggerFactory.getLogger(MyMainClass.class);


	private MyMainClass() {}

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		MyService service = ctx.getBean(MyService.class);
		
		service.log("Hi");
		
		MyService newService = ctx.getBean(MyService.class);


		String pom = "service hashcode="+ service.hashCode();
		logger.info(pom);

		pom = "newService hashcode="+ newService.hashCode();
		logger.info(pom);

		ctx.close();
	}

}
