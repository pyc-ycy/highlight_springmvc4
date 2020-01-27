//IntelliJ IDEA
//highlight_springmvc4
//converterController
//2020/1/27
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.web.ch4_5;


import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class converterController {
    @RequestMapping(value = "/convert", produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
