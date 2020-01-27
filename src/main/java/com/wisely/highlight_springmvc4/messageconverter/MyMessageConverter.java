//IntelliJ IDEA
//highlight_springmvc4
//MyMessageConverter
//2020/1/22
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.messageconverter;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;


import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
    public MyMessageConverter(){
        super(new MediaType("application","x-wisely", StandardCharsets.UTF_8));
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj>clazz, HttpInputMessage inputMessage){
        String temp = "";
        try {
             temp = StreamUtils.copyToString(inputMessage.getBody(),StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] tmpArr = temp.split("-");
        return new DemoObj(Long.valueOf(tmpArr[0]),tmpArr[1]);
    }

    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:"+obj.getId()+"-"+obj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
