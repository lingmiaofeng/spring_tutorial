package com.journaldev.spring.di.services;

public enum MessageServiceType {

    EMAIL("email"),
    TWITTER("twitter");

    private String type;


    MessageServiceType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
