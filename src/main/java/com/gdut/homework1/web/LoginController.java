package com.gdut.homework1.web;

import com.gdut.homework1.entiy.LoginEmployee;
import com.gdut.homework1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class LoginController {
    @Autowired
    private LoginService loginService;
    /**
     * 用户登陆
     * @param user_id
     * @param password
     */
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    public String login(int user_id, String password, Model mod, HttpSession session){
        LoginEmployee loginEmployee = loginService.validateLogin(user_id, password);
        if (loginEmployee != null){//成功
            session.setAttribute("loginEmployee", loginEmployee);
            if (loginEmployee.getAuthority().equals("admin")){
                return "redirect:Admin";
            }else {
                return "redirect:Employee" ;
            }
        }else {
            mod.addAttribute("message","账号或密码错误");
            return "login";
        }
    }

    @RequestMapping(value ="/Employee")
    public String toEmployee(){
        return "Employee";
    }

    @RequestMapping(value = "/Admin")
    public String toAdmin(){
        return "Admin";
    }


}
