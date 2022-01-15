package com.mockito.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestMockExampleAnnotation {

    @Mock
    List<String> mockList;

    @Test
    public void mockListWithAnnotation(){
        when(mockList.get(anyInt())).thenReturn("element");
        assertEquals("element", mockList.get(100));
    }

    // this returns null
    @Test
    public void testAddElements(){
        mockList.add("first elem");
        System.out.println("get(0) : "+mockList.get(0));
    }
}
