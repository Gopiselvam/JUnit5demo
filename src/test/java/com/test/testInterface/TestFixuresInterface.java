package com.test.testInterface;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public interface TestFixuresInterface {

    Logger logger = Logger.getLogger(TestFixuresInterface.class);

    @BeforeAll
    default void beforeAll(TestInfo info){
        logger.info("before all method test : "+info.getDisplayName());
    }

    @BeforeEach
    default void beforeEach(TestInfo info){
        logger.info("before each method test : "+info.getDisplayName());
    }

    @AfterEach
    default void afterEach(TestInfo info){
        logger.info("after each method test : "+info.getDisplayName());
    }

    @AfterAll
    default void afterAll(TestInfo info){
        logger.info("after all method test : "+info.getDisplayName());
    }
}
