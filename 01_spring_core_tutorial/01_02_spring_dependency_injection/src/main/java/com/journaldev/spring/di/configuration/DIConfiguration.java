package com.journaldev.spring.di.configuration;

import com.journaldev.spring.di.services.EmailServiceImpl;
import com.journaldev.spring.di.services.TwitterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.journaldev.spring.di.consumer"})
public class DIConfiguration {

    @Bean
    public EmailServiceImpl getEmailMessageService(){
        return new EmailServiceImpl();
    }

    @Bean
    public TwitterServiceImpl getTwitterMessageService(){
        return new TwitterServiceImpl();
    }

}
