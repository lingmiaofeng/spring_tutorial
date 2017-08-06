package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.MessageService;
import com.journaldev.spring.di.services.MessageServiceType;

public class MyXMLApplication implements Consumer  {

    private MessageService service;

    //setter-based dependency injection
    public void setService(MessageService svc){
        this.service=svc;
    }


    public boolean processMessages(String msg, String rec, MessageServiceType tyoe) {
        // some magic like validation, logging etc
        return this.service.sendMessage(msg, rec);

    }
}
