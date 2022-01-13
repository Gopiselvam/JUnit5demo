package com.test.parameterizedTests;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(Parameterized.class)
class ParameterizedTest {
                private int a;
                private int b;

                public ParameterizedTest(int a, int b) {//line 1
                                this.a = a;
                                this.b = b;
                }

                private static Collection testData() {//line 2
                     return Arrays.asList(new Object[][] { { 1, 2 }, { 5, 5 }, { 3, 3 } });
                }

                @Test
                public void test1() {
                                assertTrue(a == b);
                }
}