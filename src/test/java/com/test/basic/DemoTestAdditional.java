package com.test.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DemoTestAdditional {
                static String a;


                @BeforeAll
                public static void init(){
                                a = "one";
                }

                @Test
                public void test1(){
                                a="two";
                                assertEquals("one", a);
                }

                @Test
                public void test2(){
                                assertEquals("two", a);
                }
}