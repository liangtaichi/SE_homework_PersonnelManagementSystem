package com.gdut.homework1.service;

import com.gdut.homework1.dao.LoginDao;
import com.gdut.homework1.entiy.LoginEployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginEployee loginEployee;
    @Autowired
    private LoginDao loginDao;
    public LoginEployee validateLogin(int user_id, String password) {
        return loginDao.login(user_id, password);
    }
}
