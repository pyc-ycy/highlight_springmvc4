//IntelliJ IDEA
//highlight_springmvc4
//NormalController
//2020/1/31
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.web.ch4_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.highlight_springmvc4.service.DemoService;

@Controller
public class NormalController {
    @Autowired
    DemoService demoService;



    @RequestMapping("/normal")
    public  String testPage(Model model){
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }

}
