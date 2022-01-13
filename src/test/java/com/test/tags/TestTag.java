package com.test.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
@ExcludeTags("Highpriority")//line 1
@IncludeTags("Highpriority")

@SelectClasses(MethodTest.class)
public class TestTag {

}
class MethodTest {
    @Tag("Highpriority")
    @Test
    public void methodATest() {
        String str = "info";
        assertEquals("Infosys", str.concat("sys"));
    }

    @Tag("Highpriority")
    @Test
    public void methodBTest() {
        String str = "INFOSYS";
        assertEquals("INFOSYS", str.toUpperCase());
    } 
}
 