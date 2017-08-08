package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;
import org.jetbrains.exceptions.MyRuntimeException;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String name) {
        this.name = name;
    }

    public void throwException(){
        throw new MyRuntimeException("Dummy Exception");
    }
}
