package com.mockito.captor;

import com.mockito.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.eq;

class TestArgumentCaptorDemo {

    List<User> mockList = Mockito.mock(ArrayList.class);
    User user = new User("admin");


    @Test
    void testArgCaptor(){
        mockList.add(user);
        ArgumentCaptor<User> argumentCaptor = ArgumentCaptor.forClass(User.class);
        Mockito.verify(mockList).add(argumentCaptor.capture());
        User userCaptor = argumentCaptor.getValue();
        assertEquals("admin", userCaptor.getUname());

    }

    @Test
    void testGetArgCaptor(){
        mockList.add(10, new User("10th user"));

        ArgumentCaptor<User> arg = ArgumentCaptor.forClass(User.class);
        Mockito.verify(mockList).add(eq(10), arg.capture());
        User user = arg.getValue();
        assertEquals("10th user", user.getUname());
    }
}
