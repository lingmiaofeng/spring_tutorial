package com.journaldev.spring.di.test;

import com.journaldev.spring.di.consumer.Consumer;
import com.journaldev.spring.di.consumer.MyApplication;
import com.journaldev.spring.di.services.EmailServiceImpl;
import com.journaldev.spring.di.services.MessageServiceType;
import com.journaldev.spring.di.services.TwitterServiceImpl;
import org.jetbrains.exceptions.MyException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.journaldev.spring.di.consumer")
public class MyApplicationTest {

    private Logger logger = LoggerFactory.getLogger(MyApplicationTest.class);

    private AnnotationConfigApplicationContext context;
    private Consumer app;

    @Bean
    public EmailServiceImpl getEmailMessageService() {
        return new EmailServiceImpl(){

            public boolean sendMessage(String msg, String rec) {

                logger.debug ("Mock Email Service");
                return true;
            }
        };

    }

    @Bean
    public TwitterServiceImpl getTwitterMessageService() {
        return new TwitterServiceImpl(){

            public boolean sendMessage(String msg, String rec) {

                logger.debug ("Mock Twitter Service");
                return true;
            }
        };

    }

    @Before
    public void setUp() throws MyException {
        context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
        app = context.getBean(MyApplication.class);
        logger.debug ("Context and app was created");
        logger.debug ("context: "+context.toString());
        logger.debug ("app: "+app.toString());
    }



    @After
    public void tearDown() throws MyException {
        context.close();
        logger.debug ("Context was closed");
    }


    @Test
    public void test1() {
        Assert.assertTrue(app.processMessages("Hi Pnaj", "xxx@asdasda", MessageServiceType.EMAIL));
    }

     @Test
    public void test2() {
        Assert.assertTrue(app.processMessages("Hi Rudolf", "twitter#852",MessageServiceType.TWITTER));
    }

}
