package com.test.conditionalTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import javax.xml.bind.annotation.XmlInlineBinaryData;

public class ConditionalTesting {

    Calculator calculator = new Calculator();

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void osTestingEnabledForWindows(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @DisabledOnOs(OS.WINDOWS)
    @Test
    void osTestingDisbledForWindows(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void jreTestingEnabledForJre8(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_9)
    @Test
    void jreTestingDisbledForJre8to9(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }


    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    @Test
    void systemPropertyEnabledFor64bit(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @DisabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    @Test
    void systemPropertyDisabledFor64bit(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @EnabledIfEnvironmentVariable(named = "ENV", matches = ".*develop.*")
    @Test
    void environmetVariableEnabledForDevelopment(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }

    @DisabledIfEnvironmentVariable(named = "ENV", matches = ".*develop.*")
    @Test
    void environmetVariableDisabledForDevelopment(){
        Assertions.assertEquals(600, calculator.multiplication(50,12));
    }



}
