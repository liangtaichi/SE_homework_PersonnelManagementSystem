package com.gdut.homework1.entiy;

public class LoginEmployee {
    int user_id;
    String password;
    String authority;

    @Override
    public String toString() {
        return "LoginEployee{" +
                "user_id=" + user_id +
                ", password='" + password + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
