package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.Consumer;

@FunctionalInterface
public interface MessageServiceInjector {

	public Consumer getConsumer();
}
