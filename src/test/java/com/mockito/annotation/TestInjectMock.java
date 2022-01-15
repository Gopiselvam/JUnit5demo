package com.mockito.annotation;

import com.mockito.Book;
import com.mockito.BookService;
import com.mockito.ILogin;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestInjectMock {

    @Mock
    static ILogin iLogin;

    @InjectMocks
    static BookService bookService;

    @Captor
    ArgumentCaptor<String> arg;



    @Test
    public void adminUserLoginTest(){
        when(iLogin.login(eq("admin"), anyString())).thenReturn("12345");
        when(iLogin.isAdmin("admin")).thenReturn(true);
        when(iLogin.validateSession("12345")).thenReturn(true);

        String sessionId = iLogin.login("admin", "dummypass");
        assertEquals(123, bookService.add(sessionId, "admin", new Book()));

        verify(iLogin).isAdmin(arg.capture());
        String userNameCaptured = arg.getValue();
        assertEquals("admin", userNameCaptured);

    }


}
