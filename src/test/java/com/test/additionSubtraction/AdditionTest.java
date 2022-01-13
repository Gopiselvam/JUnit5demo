package com.test.additionSubtraction;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdditionTest {

    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(12, calculator.addition(2,10) );

    }
}
