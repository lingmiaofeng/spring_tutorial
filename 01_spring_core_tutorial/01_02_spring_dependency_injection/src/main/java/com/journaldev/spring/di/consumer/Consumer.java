package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.MessageServiceType;

@FunctionalInterface
public interface Consumer {
    boolean processMessages(String msg, String rec, MessageServiceType tyoe);
}
