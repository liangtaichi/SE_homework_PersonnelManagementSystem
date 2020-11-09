package com.gdut.homework1.web;

import com.gdut.homework1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
    @Autowired
    private LoginService loginService;

}
