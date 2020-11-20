package com.gdut.homework1.interceptor;

import com.gdut.homework1.entiy.LoginEmployee;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 * @author daxian233
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();

        //只有index是可以公开的
        if (uri.indexOf("/index") >= 0){
            return true;
        }

        //获取session并判断
        HttpSession session = httpServletRequest.getSession();
        LoginEmployee loginEmployee = (LoginEmployee) session.getAttribute("loginEmployee");
        if (loginEmployee != null){
            return true;
        }

        //不符合条件的给出提示信息
        httpServletRequest.setAttribute("message","还没登陆");
        httpServletRequest.getRequestDispatcher("WEB-INF/index.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
