package com.gdut.homework1.service;

import com.gdut.homework1.dao.IntroduceDao;

import com.gdut.homework1.entiy.LoginEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

@Service
public class IntroduceServiceImpl implements IntroduceService{


    @Autowired
    private IntroduceDao introduceDao;


    /**
     * 获取简介
     * @param loginEmployee
     * @return
     */
    public String getIntroduce(LoginEmployee loginEmployee) {
        return introduceDao.getIntroduce(loginEmployee);
    }
    /**
     * 增加简介
     * @param loginEmployee
     * @return
     */
    public void addIntroduce(LoginEmployee loginEmployee, String introduce) {
        introduceDao.addIntroduce(loginEmployee,introduce);
    }
    /**
     * 删除简介
     * loginEmployee
     * @return
     */
    public void deleteIntroduce(LoginEmployee loginEmployee) {
        introduceDao.deleteIntroduce(loginEmployee);
    }
    /**
     * 修改简介
     * @param loginEmployee
     * @return
     */
    public void updateIntroduce(LoginEmployee loginEmployee, String introduce) {
        introduceDao.updateIntroduce(loginEmployee,introduce);
    }
}
