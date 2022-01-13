package com.test.backwardCompatability;

import com.test.service.Calculator;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.migrationsupport.EnableJUnit4MigrationSupport;

@EnableJUnit4MigrationSupport
public class JUnit4Test {

    Calculator calculator = new Calculator();

    @Ignore
    @Test
    public void additionTest(){
        Assert.assertEquals(5, calculator.addition(7,-2));
    }

    @Test
    public void additionTest2(){
        Assert.assertEquals(50, calculator.addition(48,2));
    }
}
