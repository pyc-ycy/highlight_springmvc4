//IntelliJ IDEA
//highlight_springmvc4
//MyRestController
//2020/1/31
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.web.ch4_6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.highlight_springmvc4.service.DemoService;

@RestController
public class MyRestController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest" ,produces="text/plain;charset=UTF-8")
    public @ResponseBody String testRest(){
        return demoService.saySomething();
    }

}
