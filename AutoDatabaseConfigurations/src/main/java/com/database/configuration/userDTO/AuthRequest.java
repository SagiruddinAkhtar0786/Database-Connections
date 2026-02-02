package com.database.configuration.userDTO;

public class AuthRequest {

    private String username;   // lowercase!
    private String password;   // lowercase!

    public AuthRequest() {}    // Jackson needs this

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
