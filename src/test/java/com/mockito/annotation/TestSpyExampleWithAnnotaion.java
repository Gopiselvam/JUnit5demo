package com.mockito.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class TestSpyExampleWithAnnotaion {

    @Spy
    List<String> spyList = new ArrayList<>();

    @Test
    public void testSpySize(){
        doReturn(0).when(spyList).size();
        assertEquals(0, spyList.size());
        spyList.add("spy one");
        System.out.println("first elem in spy = "+spyList.get(0));
    }
}
