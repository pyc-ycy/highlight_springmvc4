//@Software: IntelliJ IDEA
// @Project:highlight_springmvc4
//@File:DemoRestController.java
// @User:彭友聪
//@Date:2019/11/04
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_springmvc4.web.ch4_3;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wisely.highlight_springmvc4.domain.DemoObj;
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");
    }
    @RequestMapping(value = "/getxml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy");
    }
}
