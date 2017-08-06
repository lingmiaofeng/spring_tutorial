package com.journaldev.spring.di.services;

import org.jetbrains.common.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitterServiceImpl implements MessageService {

    private Logger logger = LoggerFactory.getLogger(TwitterServiceImpl.class);

    public boolean sendMessage( String receiver, String message) {

        String msg = Utils.getMsg("Twitter",message, receiver);
        logger.debug (msg);
        return true;
    }
}
