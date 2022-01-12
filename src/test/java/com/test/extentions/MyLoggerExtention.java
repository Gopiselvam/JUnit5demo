package com.test.extentions;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyLoggerExtention implements BeforeEachCallback, AfterEachCallback {

    private Logger logger;

    public MyLoggerExtention(){}

    public MyLoggerExtention(String msg) {
        System.out.println(msg);
    }

    @Override
    public void beforeEach(ExtensionContext context) {
        logger = Logger.getLogger(context.getClass().getName());
        logger.info("Inside BeforeEach method : "+ context.getDisplayName());
    }

    @Override
    public void afterEach(ExtensionContext context) {
        logger.info("Inside AfterEach method : "+ context.getDisplayName());
        logger = null;
    }
}
