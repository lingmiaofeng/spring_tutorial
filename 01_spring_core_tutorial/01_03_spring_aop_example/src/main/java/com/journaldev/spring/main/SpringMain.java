package com.journaldev.spring.main;

import com.journaldev.spring.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    private static Logger logger = LoggerFactory.getLogger(SpringMain.class);

    private SpringMain() {}

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

        logger.debug(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Pankaj");

        employeeService.getEmployee().throwException();

        ctx.close();
    }
}
