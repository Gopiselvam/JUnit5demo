package com.test;

import org.junit.jupiter.api.*;


public class TestBasic {

    @DisplayName("Check java version 1.8")
    @Test
    void testSystem(){
        System.out.println(System.getProperty("java.runtime.version"));
        Assumptions.assumeTrue(System.getProperty("java.runtime.version").startsWith("1.8"));

//        Assumptions.assumeFalse(System.getProperty("java.runtime.version").startsWith("1.8"));
        Assertions.assertTrue(10==10);
        Assertions.assertEquals(10,10);
    }
}
