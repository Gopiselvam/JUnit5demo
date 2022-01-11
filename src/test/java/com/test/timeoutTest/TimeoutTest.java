package com.test.timeoutTest;

import com.test.service.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.parallel.Execution;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeoutTest {

    private final Calculator calculator = new Calculator();

    @Timeout(3)
    @Test
    public void annotationValidTest(){
        calculator.delay(2);
    }

    @Disabled
    @Timeout(value = 3, unit = TimeUnit.NANOSECONDS)
    @Test
    public void annotationInvalidTest(){
        calculator.delay(2);
    }


    @Test
    public void assertTimeoutValidTest(){
        Executable executable = () -> calculator.delay(2);
        assertTimeout(Duration.of(3, ChronoUnit.SECONDS), executable);

    }

    @Disabled
    @Test
    public void assertTimeoutInvalidTest(){
        Executable executable = () -> calculator.delay(2);
        assertTimeout(Duration.of(3, ChronoUnit.NANOS), executable);
    }

    @Test
    public void assertTimeoutPreemptivelyValidTest(){
        Executable executable = () -> calculator.delay(2);
        assertTimeoutPreemptively(Duration.ofSeconds(3), executable);
    }

    @Disabled
    @Test
    public void assertTimeoutPreemptivelyInvalidTest(){
        Executable executable = () -> calculator.delay(2);
        assertTimeoutPreemptively(Duration.ofNanos(3), executable);
    }


}
