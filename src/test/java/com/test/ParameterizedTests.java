package com.test;

import com.test.service.RomanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {


    @ValueSource(strings = {"I", "X" , "C", "IX"})
    @ParameterizedTest
    public void testRomanNumberExists(String romanNum){
        Assertions.assertTrue(RomanNumeral.contains(romanNum));
    }

    @NullAndEmptySource
    @ValueSource(strings = {" ", "", "\t", "\n", "  "})
    @ParameterizedTest
    public void nullEmptyAndBlankStringTest(String valu){
        Assertions.assertTrue(valu == null || valu.trim().isEmpty());
    }

    @EnumSource(value = RomanNumeral.class, names = {"I", "V"})
    @ParameterizedTest
    public void checkRomanWithEnum(RomanNumeral numeral){
        Assertions.assertTrue(RomanNumeral.contains(numeral.name()));
    }
}
