package com.journaldev.java.dependencyinjection.test;

import com.journaldev.java.dependencyinjection.consumer.Consumer;
import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import com.journaldev.java.dependencyinjection.injector.MessageServiceInjector;
import com.journaldev.java.dependencyinjection.service.MessageService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyDIApplicationJUnitTest {

	private Logger logger = LoggerFactory.getLogger(MyDIApplicationJUnitTest.class);

	private MessageServiceInjector injector;

	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new MessageServiceInjector() {
			

			public Consumer getConsumer() {
				//mock the message service
				return new MyDIApplication(new MessageService() {

					public void sendMessage(String msg, String rec) {
						logger.debug("Mock Message Service implementation");
					}

				});
			}
		};
		logger.debug("injector has been created");
	}

	@Test
	public void test0()  {
		Assert.assertNotNull(injector);
	}

	@Test
	public void test1() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
		logger.debug("Message has been sent");
	}
	
	@After
	public void tear(){
		injector = null;
		Assert.assertNull(injector);
		logger.debug("injector is set to null");
	}

}
