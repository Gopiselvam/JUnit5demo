package com.mockito.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

class TestBasicMockito {

    static List<String> mockList;

    @BeforeAll
    static void createMock(){
        mockList = Mockito.mock(List.class);
        when(mockList.get(anyInt())).thenReturn("element");
        when(mockList.get(0)).thenReturn("first element");
        when(mockList.get(1)).thenReturn("second element");
        when(mockList.get(-1)).thenThrow(new ArrayIndexOutOfBoundsException());
        doNothing().when(mockList).add(anyInt(), anyString());
        doThrow(new ArrayIndexOutOfBoundsException()).when(mockList).add(eq(-1), anyString());
    }

    @Test
    void testMockedList(){
        assertEquals("first element", mockList.get(0));
        assertEquals("element", mockList.get(10));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mockList.get(-1));
    }

    @Test
    void testVoidMethods(){
        mockList.add(100, "100th index");
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> mockList.add(-1, "negative element"));
    }

    @Test
    void verifyIf100thndexAdded(){
        mockList.add(101, "100th index");
        verify(mockList).add(eq(101), anyString());
    }

    @Test
    void verifyMethods(){
        System.out.println("***** verify methods ****");
        System.out.println("index 0 :" + mockList.get(0));
        System.out.println("index 1 :" + mockList.get(1));
        System.out.println("index 11 :" + mockList.get(11));
        verify(mockList, atLeast(2)).get(anyInt());
    }

}
