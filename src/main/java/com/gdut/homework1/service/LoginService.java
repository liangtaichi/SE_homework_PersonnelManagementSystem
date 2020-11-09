package com.gdut.homework1.service;

import com.gdut.homework1.entiy.LoginEployee;

public interface LoginService {
    /**验证登陆
     * @Param user_id 用户员工号
     * @Param password 用户密码
     */
    LoginEployee validateLogin(int user_id,String password);
}
