package com.mockito;

public class BookService {

    private ILogin iLogin;

    public BookService(ILogin iLogin) {
        this.iLogin = iLogin;
    }

    public int add(String sessionId, String uName, Book book){
        if(iLogin.validateSession(sessionId) && iLogin.isAdmin(uName)){
            return 123;
        }
        return 0;
    }
}
