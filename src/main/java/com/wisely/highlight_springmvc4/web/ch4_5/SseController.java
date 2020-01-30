//IntelliJ IDEA
//highlight_springmvc4
//SseController
//2020/1/30
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.web.ch4_5;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class SseController {
    @RequestMapping(value = "push", produces = "text/event-stream")
    public @ResponseBody String push(){
        Random r = new Random();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "data:Testing 1,2,3"+r.nextInt()+"\n\n";
    }
}
