package com.journaldev.spring.di;

import com.journaldev.spring.di.configuration.DIConfiguration;
import com.journaldev.spring.di.consumer.Consumer;
import com.journaldev.spring.di.consumer.MyApplication;
import com.journaldev.spring.di.services.MessageServiceType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

    private ClientApplication() {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Consumer app = context.getBean(MyApplication.class);

        app.processMessages("Hi Pankaj", "pankaj@abc.com", MessageServiceType.EMAIL);
        app.processMessages("Hi Rudolf", "Twitter#123", MessageServiceType.TWITTER);

        //close the context
        context.close();
    }
}
