package com.test.additionSubtraction;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.subtraction(12,2) );
    }
}
