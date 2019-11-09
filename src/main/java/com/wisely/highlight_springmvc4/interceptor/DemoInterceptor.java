//@Software: IntelliJ IDEA
// @Project:highlight_springmvc4
//@File:DemoInterceptor.java
// @User:彭友聪
//@Date:2019/11/09
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_springmvc4.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DemoInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long starTime = System.currentTimeMillis();
        request.setAttribute("startTime", starTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为：" + (endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }
}
