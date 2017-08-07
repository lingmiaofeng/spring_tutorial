package com.journaldev.java.dependencyinjection.consumer;

@FunctionalInterface
public interface Consumer {

	void processMessages(String msg, String rec);
}
