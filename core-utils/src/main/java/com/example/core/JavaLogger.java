package com.example.core;

public class JavaLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
