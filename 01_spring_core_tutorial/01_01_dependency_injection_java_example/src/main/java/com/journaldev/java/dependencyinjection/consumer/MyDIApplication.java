package com.journaldev.java.dependencyinjection.consumer;

import com.journaldev.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer{

	private MessageService service;

	public MyDIApplication(){
		//used by MyLegacyTest
	}
	public MyDIApplication(MessageService svc){
		this.service=svc;
	}
	
	public void setService(MessageService service) {
		this.service = service;
	}

	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}
