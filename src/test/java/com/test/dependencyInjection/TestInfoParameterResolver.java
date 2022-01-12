package com.test.dependencyInjection;

import com.test.service.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("test info parameter resolver")
public class TestInfoParameterResolver {

    Calculator calculator = new Calculator();

    public TestInfoParameterResolver(TestInfo info){
        assertEquals("test info parameter resolver", info.getDisplayName());
    }

    @BeforeEach
    public void setup(TestInfo info){
        assertTrue("addition test".equals(info.getDisplayName()) || "multiplication test".equals(info.getDisplayName()));
    }


    @Tag("add-tag")
    @Tag("addition-tag")
    @DisplayName("addition test")
    @Test
    public void additionTest(TestInfo info){
        assertEquals("addition test", info.getDisplayName());
        assertTrue(info.getTags().contains("add-tag"));
        assertEquals(5, calculator.addition(1,4));
    }

    @Tag("multip-tag")
    @DisplayName("multiplication test")
    @Test
    public void multiplicationTest(TestInfo info){
        assertEquals("multiplication test", info.getDisplayName());
        assertTrue(info.getTags().contains("multip-tag"));
        assertEquals(30, calculator.multiplication(5,6));
    }

}
