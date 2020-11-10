package com.gdut.homework1.service;

import com.gdut.homework1.dao.LoginDao;
import com.gdut.homework1.entiy.LoginEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginEmployee loginEmployee;
    @Autowired
    private LoginDao loginDao;

    /**
     * 登陆
     * @param user_id
     * @param password
     * @return
     */
    public LoginEmployee validateLogin(int user_id, String password) {
        return loginDao.login(user_id, password);
    }


}
