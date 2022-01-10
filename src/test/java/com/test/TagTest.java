package com.test;

import com.test.service.Calculator;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

public class TagTest {

    static int a = 0;
    static int b = 0;
    static Calculator calculator;

    @BeforeAll
    public static void setUpVariables(){
        a = 10;
        b = 5;
        calculator = new Calculator();
    }

    @Test
    @Tag("success")
    public void validAddition(){
        Assertions.assertEquals(15, calculator.addition(a,b));
    }

    @Disabled
    @Test
    @Tag("failure")
    public void invalidMultiplication(){
        Assertions.assertEquals(15, calculator.multiplication(a,b));
    }


    @Disabled
    @Test
    @Tag("failure")
    @Tag("cloud")
    public void invalidMultiplicationCloud(){
        Assertions.assertEquals(15, calculator.multiplication(a,b));
    }

}
