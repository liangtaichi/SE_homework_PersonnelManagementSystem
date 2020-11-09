package com.gdut.homework1.dao;

import com.gdut.homework1.entiy.LoginEployee;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
    public LoginEployee login(@Param("user_id") int user_id, @Param("password") String password);

}
