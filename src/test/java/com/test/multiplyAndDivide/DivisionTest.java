package com.test.multiplyAndDivide;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(10, calc.division(20, 2));
    }
}
