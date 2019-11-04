//@Software: IntelliJ IDEA
// @Project:highlight_springmvc4
//@File:DemoObj.java
// @User:彭友聪
//@Date:2019/11/04
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_springmvc4.domain;

public class DemoObj {
    private Long id;
    private String name;
    public DemoObj() {
        super();
    }
    public DemoObj(Long id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
