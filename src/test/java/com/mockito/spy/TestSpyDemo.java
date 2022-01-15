package com.mockito.spy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;

class TestSpyDemo {

    @Test
    void testSpy(){
        List<String> list = new ArrayList<>();
        List<String> mockList = Mockito.spy(list);

        doReturn(0).when(mockList).size();
        mockList.add("one");
        mockList.add("two");
        System.out.println(mockList.get(0));
        System.out.println(mockList.get(1));
        System.out.println(mockList.size());
    }
}
