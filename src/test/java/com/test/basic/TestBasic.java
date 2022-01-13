package com.test.basic;

import com.test.service.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestBasic {

    @DisplayName("Check java version 1.8")
    @Test
    void testSystem(){
        System.out.println(System.getProperty("java.runtime.version"));
        Assumptions.assumeTrue(System.getProperty("java.runtime.version").startsWith("1.8"));

//        Assumptions.assumeFalse(System.getProperty("java.runtime.version").startsWith("1.8"));
//        Assertions.assertTrue(10==10);
//        Assertions.assertEquals(10,10);
    }

    @Test
    public void test1(){
        A a = new A();
        Calculator b = new Calculator();
//        assertNotSame(a.getClass(), b.getClass());
        assertNotSame(a.getClass(), b.getClass());
    }

    class A{}

    @Test
    public void exceptionTest()
    {
        Executable exec = () ->{throw new CusExp();};
        assertThrows(CusExp.class, exec);
    }

    class CusExp extends Exception{

    }
}
