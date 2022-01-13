package com.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.test"})
//@SelectClasses({com.test.additionSubtraction.AdditionTest.class, com.test.multiplyAndDivide.MultiplicationTest.class})
//@IncludeClassNamePatterns(".*Test.*")
//@ExcludePackages("com.test.multiplyAndDivide")
//@IncludePackages("com.test.multiplyAndDivide")
public class SuiteTest {

    @Test
    void additionValidTest() {
        assertTrue(true);
    }
}
