package com.journaldev.java.dependencyinjection.service;

@FunctionalInterface
public interface MessageService {

	void sendMessage(String msg, String rec);
}
