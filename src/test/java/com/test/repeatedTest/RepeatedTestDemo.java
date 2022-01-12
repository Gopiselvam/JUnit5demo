package com.test.repeatedTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedTestDemo {
    Calculator calculator = new Calculator();

    @BeforeEach
    public void beforethods(){
        System.out.println("init");
    }

    @RepeatedTest(5)
    void repeateMultiplication5times(){
        assertEquals(600, calculator.multiplication(50,12));
    }
}
