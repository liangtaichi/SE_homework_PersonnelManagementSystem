package com.gdut.homework1.service;

import com.gdut.homework1.entiy.LoginEmployee;

public interface IntroduceService {
    /**
     *  根据用户ID获取简介
     *
     */
    String getIntroduce(LoginEmployee loginEmployee);


    /**
     * 根据用户ID增加简介
     *
     */
    void addIntroduce(LoginEmployee loginEmployee,String introduce);

    /**
     * 根据用户ID删除简介
     *
     */

    void deleteIntroduce(LoginEmployee loginEmployee);

    /**
     * 根据用户ID修改简介
     *
     */

    void updateIntroduce(LoginEmployee loginEmployee,String introduce);

}
