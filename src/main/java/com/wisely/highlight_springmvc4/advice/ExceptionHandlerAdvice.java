//IntelliJ IDEA
//highlight_springmvc4
//ExceptionHandlerAdvice
//2020/1/21
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.advice;


import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder){
//        webDataBinder.setDisallowedFields("id");
//    }
}
