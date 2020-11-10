package com.gdut.homework1.dao;

import com.gdut.homework1.entiy.LoginEmployee;
import org.apache.ibatis.annotations.Param;

public interface LoginDao {
    /**
     * 根据用户id和密码查找用户
     * @param user_id
     * @param password
     * @return
     */
     LoginEmployee login(@Param("user_id") int user_id, @Param("password") String password);

    /**
     * 增加用户
     * @param loginEmployee
     */
    void addEmployee(LoginEmployee loginEmployee);
}
