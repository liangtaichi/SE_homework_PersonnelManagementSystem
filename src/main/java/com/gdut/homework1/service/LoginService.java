package com.gdut.homework1.service;

import com.gdut.homework1.entiy.LoginEmployee;

public interface LoginService {
    /**验证登陆
     * @param  user_id 用户员工号
     * @param  password 用户密码
     */
    LoginEmployee validateLogin(int user_id, String password);
}
