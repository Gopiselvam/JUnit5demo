package com.test.dependencyInjection;

import com.test.service.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepetitionInfoParameterResolver {

    Calculator calculator = new Calculator();

    @BeforeEach
    public void setup(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println("current repetition "+ repetitionInfo.getCurrentRepetition());
        System.out.println("total repetition "+ repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(5)
    public void additionTest(RepetitionInfo repetitionInfo){
        assertEquals(5, repetitionInfo.getTotalRepetitions());
        assertEquals(5, calculator.addition(2,3));
    }
}
