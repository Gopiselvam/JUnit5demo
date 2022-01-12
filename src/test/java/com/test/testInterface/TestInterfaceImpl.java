package com.test.testInterface;

import com.test.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterfaceImpl implements TestFixuresInterface{

    private static Calculator calculator =  new Calculator();

    @Test
    public void subtractPositiveNumbers(){
        assertEquals(9, calculator.subtraction(11, 2));
    }

    @Test
    public void subtractNegativeNumbers(){
        assertEquals(1, calculator.subtraction(-10,-11));
    }

}
