package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.EmailServiceImpl;
import com.journaldev.spring.di.services.MessageService;
import com.journaldev.spring.di.services.MessageServiceType;
import com.journaldev.spring.di.services.TwitterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication implements Consumer {

    @Autowired
    private EmailServiceImpl emailService;

    @Autowired
    private TwitterServiceImpl twitterService;



    public boolean processMessages(String msg, String rec, MessageServiceType type) {
        MessageService service;

        if(MessageServiceType.EMAIL.equals(type))
            service = emailService;
        else
            service = twitterService;

        //some magic like validation, logging etc
        return service.sendMessage(msg, rec);
    }
}
