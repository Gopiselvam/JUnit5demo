package com.test;

import com.test.service.Calculator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

public class TestFixures {
    private static Logger logger = Logger.getLogger(TestFixures.class);
    Calculator calc = new Calculator();
    private int a;
    private int b;
    private int actual;

    @BeforeAll
    private static void setUpBeforeClass(TestInfo info){
        logger.info(info.getDisplayName());
    }

    @BeforeEach
    void setUp(TestInfo info){
        logger.info(info.getDisplayName());
        a = 20;
        b=30;
    }

    @Test
    void additionTest(){
        actual = calc.addition(a,b);
        Assertions.assertEquals(50,actual);
    }

    @Test
    void multiplicationTest(){
        actual = calc.multiplication(a,b);
        Assertions.assertEquals(600, actual);
    }

    @AfterEach
    void tearDown(TestInfo info){
        logger.info(info.getDisplayName());
        a =0;
        b = 0;
    }

    @AfterAll
    static void tearDownAfterClass(TestInfo info){
        logger.info(info.getDisplayName());
    }





}
