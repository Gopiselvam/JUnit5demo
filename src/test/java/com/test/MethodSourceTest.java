package com.test;

import com.test.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodSourceTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init(){
        calculator = new Calculator();
    }

    public static Stream<List<Integer>> modulusProvider(){
        return Stream.of(Arrays.asList(5,10,15,20));
    }

    @MethodSource(value = "modulusProvider")
    @ParameterizedTest
    public void modulusTest(List<Integer> list){
        for(Integer mod : list){
            Assertions.assertEquals(0, calculator.modulus(mod, 5));
        }
    }

    public static Stream<Arguments> addTestWithArgument(){
        return Stream.of(Arguments.of(5,6,11));
    }

    @MethodSource
    @ParameterizedTest
    public void addTestWithArgument(int a, int b, int result){
        Assertions.assertEquals(result, calculator.addition(a,b));
    }

    public static Stream<Arguments> listAdditionProvider(){
        return Stream.of(Arguments.of(Arrays.asList(5,6), 3, Arrays.asList(8,9)),
                Arguments.of(Arrays.asList(Integer.MAX_VALUE, -1, 0), 1, Arrays.asList(Integer.MIN_VALUE, 0, 1)));
    }


    @MethodSource("listAdditionProvider")
    @ParameterizedTest
    public void testAdditionWithArraysList(List<Integer> input, int increment, List<Integer> output){

        for (int i = 0; i < input.size(); i++) {
            input.set(i, calculator.addition(input.get(i), increment));
        }
        Assertions.assertEquals(output, input);
    }

    @MethodSource("com.test.ParameterizedTests#multiplicationProvider")
    @ParameterizedTest
    public void testMultiplicationProviderFromOtherClass(int a, int b, int result){
        Assertions.assertEquals(result, calculator.multiplication(a,b));
    }
}
