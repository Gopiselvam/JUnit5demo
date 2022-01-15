package com.mockito.annotation;

import com.mockito.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CaptorTest {

    @Mock
    List<User> listUser;

    @Captor
    ArgumentCaptor<User> arg;

    @Test
    public void testCaptor(){
        User user = new User("admin");
        listUser.add(user);
        verify(listUser).add(arg.capture());

        User capturedUser = arg.getValue();
        assertEquals("admin", capturedUser.getUname());

    }

}
