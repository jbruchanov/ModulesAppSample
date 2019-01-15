package com.example.core;

import javax.inject.Inject;

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
