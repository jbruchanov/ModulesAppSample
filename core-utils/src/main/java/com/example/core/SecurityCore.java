package com.example.core;

import com.example.core.scopes.AppScope;

import javax.inject.Inject;

@AppScope
public class SecurityCore {

    private final Logger mLogger;

    @Inject
    public SecurityCore(Logger logger) {
        mLogger = logger;
    }

    public void doSomething() {
        mLogger.log("doing something");
    }
}
