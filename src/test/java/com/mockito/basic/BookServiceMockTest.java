package com.mockito.basic;

import com.mockito.Book;
import com.mockito.BookService;
import com.mockito.ILogin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceMockTest {

    static BookService bookService;
    static ILogin iLogin;

    @BeforeAll
    public static void mockSetup(){
        iLogin = mock(ILogin.class);
        bookService = new BookService(iLogin);
        when(iLogin.login("admin", "adminpass")).thenReturn("12345");
        when(iLogin.validateSession("12345")).thenReturn(true);
        when(iLogin.isAdmin("admin")).thenReturn(true);
    }

    @Test
    void testAddBooksByAdmin(){
        String sessionId = iLogin.login("admin", "adminpass");
        Book book = new Book(101, "Da vince code", "Dan brown", 1534.35);

        Integer res = bookService.add(sessionId, "admin", book);
        assertEquals(123, res);
    }

    @Test
    void testSessionForOtherUsers(){
        when(iLogin.login(anyString(), anyString())).thenReturn("54321");
        String sessionId = iLogin.login("others", "otherspass");
        assertEquals(0, bookService.add(sessionId,"others", new Book()));
    }



}
