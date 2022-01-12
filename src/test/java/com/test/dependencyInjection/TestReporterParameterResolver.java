package com.test.dependencyInjection;

import com.test.service.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReporterParameterResolver {


    private Calculator cobj = new Calculator();

    @Test
    public void additionTest(TestReporter testReporter){
        testReporter.publishEntry("Status Message: inside addition test");
        assertEquals(2, cobj.addition(1, 1));
    }

    @Test
    public void subtractionTest(TestReporter testReporter){
        testReporter.publishEntry("custom entry ", "subtraction test");
        assertEquals(4, cobj.subtraction(6, 2));
    }

    @Test
    public void multiplicationTest(TestReporter testReporter){
        Map<String, String> map = new HashMap<>();
        map.put("custom message 1", "inside multiplication test method");
        map.put("custom message 2", "the parameters are 2 and 2");

        testReporter.publishEntry(map);
        assertEquals(4, cobj.multiplication(2,2));
    }
}
