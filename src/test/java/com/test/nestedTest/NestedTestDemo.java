package com.test.nestedTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTestDemo {

    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod(){
        calculator = new Calculator();
        System.out.println("Inside Before All");
    }


    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Inside BeforeEach method");
    }

    @Nested
    class SubtractionTest{

        @Test
        public void subtractPositiveNumbers(){
            assertEquals(9, calculator.subtraction(11, 2));
        }

        @Test
        public void subtractNegativeNumbers(){
            assertEquals(1, calculator.subtraction(-10,-11));
        }

    }

    @Nested
    class MultiplicationTest{

        @Test
        public void multiplyPositiveAndNegativeNumber(){
            assertEquals(-90, calculator.multiplication(-5, 18));
        }

        @Test
        public void multiplyNegativeNumbers(){
            assertEquals(100, calculator.multiplication(-2,-50));
        }
    }
}
