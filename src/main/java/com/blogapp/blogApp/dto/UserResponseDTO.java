package com.blogapp.blogApp.dto;

public class UserResponseDTO {

    private String fullName;
    private String email;
    private String password;
    private String token;

    public UserResponseDTO(String fullName, String email, String password, String token) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.token = token;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
