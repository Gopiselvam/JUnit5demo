package com.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.test"})
//@SelectClasses({com.test.additionSubtraction.AdditionTest.class, com.test.multiplyAndDivide.MultiplicationTest.class})
//@IncludeClassNamePatterns(".*Test.*")
//@ExcludePackages("com.test.multiplyAndDivide")
//@IncludePackages("com.test.multiplyAndDivide")
public class SuiteTest {
}
