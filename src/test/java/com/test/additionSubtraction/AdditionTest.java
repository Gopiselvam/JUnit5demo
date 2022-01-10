package com.test.additionSubtraction;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(12, calculator.addition(2,10) );

    }
}
