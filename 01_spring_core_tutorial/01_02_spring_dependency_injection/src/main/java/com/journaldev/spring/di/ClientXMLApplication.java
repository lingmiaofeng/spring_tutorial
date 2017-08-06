package com.journaldev.spring.di;

import com.journaldev.spring.di.consumer.Consumer;
import com.journaldev.spring.di.consumer.MyXMLApplication;
import com.journaldev.spring.di.services.MessageServiceType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientXMLApplication {

    private ClientXMLApplication() {
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml");
        Consumer app = context.getBean(MyXMLApplication.class);

        app.processMessages("Hi Pankaj", "pankaj@abc.com", MessageServiceType.EMAIL );
        app.processMessages("Hi rudolf", "twitter#321", MessageServiceType.TWITTER );

        // close the context
        context.close();
    }
}
