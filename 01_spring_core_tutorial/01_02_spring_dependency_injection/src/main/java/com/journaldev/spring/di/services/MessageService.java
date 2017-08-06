package com.journaldev.spring.di.services;

@FunctionalInterface
public interface MessageService {

    boolean sendMessage(String msg, String rec);
}
