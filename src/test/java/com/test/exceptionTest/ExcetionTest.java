package com.test.exceptionTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExcetionTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    @Test
    public void divideByZero(){
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.division(10, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
}
