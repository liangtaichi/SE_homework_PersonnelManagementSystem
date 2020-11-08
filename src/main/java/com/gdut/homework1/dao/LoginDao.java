package com.gdut.homework1.dao;

import com.gdut.homework1.entiy.LoginEployee;

public interface LoginDao {
    public LoginEployee login(int user_id,String password);
}
