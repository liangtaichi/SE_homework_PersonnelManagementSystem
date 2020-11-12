package com.gdut.homework1.dao;

import com.gdut.homework1.entiy.LoginEmployee;
import org.apache.ibatis.annotations.Param;

public interface IntroduceDao {
    String getIntroduce(LoginEmployee loginEmployee);




    void addIntroduce(@Param("loginEmployee")LoginEmployee loginEmployee,  @Param("introduce") String introduce);



    void updateIntroduce(LoginEmployee loginEmployee,@Param("introduce") String introduce);


    void deleteIntroduce(@Param("loginEmployee")LoginEmployee loginEmployee);

}
