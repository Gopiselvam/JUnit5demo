package com.mockito;

public interface ILogin {

    public String login(String userName, String password);

    public boolean validateSession(String sessionId);

    public boolean isAdmin(String userName);
}