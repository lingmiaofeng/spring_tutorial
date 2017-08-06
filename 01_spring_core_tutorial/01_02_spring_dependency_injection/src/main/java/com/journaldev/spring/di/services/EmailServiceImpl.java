package com.journaldev.spring.di.services;

import org.jetbrains.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);

    public boolean sendMessage(String receiver, String message) {

        String msg = Utils.getMsg("Email",message, receiver);
        logger.debug (msg);

        return true;
    }
}
