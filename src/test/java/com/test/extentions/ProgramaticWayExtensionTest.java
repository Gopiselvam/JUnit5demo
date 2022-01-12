package com.test.extentions;

import com.test.service.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramaticWayExtensionTest {

    Calculator calculator = new Calculator();

    @RegisterExtension
    MyLoggerExtention mylog = new MyLoggerExtention("MyLoggerExtention registered for : "+this.getClass());

    @Test
    public void additionTest(){
        assertEquals(10, calculator.addition(5,5));
    }

    @Test
    public void subtractionTest(){
        assertEquals(Integer.MAX_VALUE, calculator.subtraction(Integer.MIN_VALUE, 1));
    }
}
