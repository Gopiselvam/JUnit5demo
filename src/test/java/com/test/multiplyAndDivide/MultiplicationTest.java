package com.test.multiplyAndDivide;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(20, calc.multiplication(2,10));
    }
}
