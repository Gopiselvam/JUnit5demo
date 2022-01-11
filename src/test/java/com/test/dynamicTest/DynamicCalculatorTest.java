package com.test.dynamicTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DynamicCalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    private static void init(){
        calculator = new Calculator();
    }

    @TestFactory
    Collection<DynamicTest> convertToNumberTest(){
        List<DynamicTest> dynamicTests = new ArrayList<>();
        List<String> romanSymbolList = new ArrayList<>(Arrays.asList("I", "V", "X", "L", "C", "D", "M", "K", " "));
        List<Integer> romanNumberList = new ArrayList<>(Arrays.asList(1, 5, 10, 50, 100, 500, 1000, null, null));

        for (int i = 0; i < romanSymbolList.size(); i++) {
            String romanSymbol = romanSymbolList.get(i);
            Integer romanNumber = romanNumberList.get(i);
            Executable executable = () -> Assertions.assertEquals(romanNumber, calculator.convertToNumber(romanSymbol));
            String diplayName = "Test convert roman " + romanSymbol;
            DynamicTest dynamicTest = DynamicTest.dynamicTest(diplayName, executable);
            dynamicTests.add(dynamicTest);
        }
        
        return dynamicTests;
    }

}
