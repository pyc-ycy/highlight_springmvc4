//@Software: IntelliJ IDEA
// @Project:highlight_springmvc4
//@File:MyMvcConfig.java
// @User:彭友聪
//@Date:2019/11/03
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_springmvc4;
import com.wisely.highlight_springmvc4.interceptor.DemoInterceptor;
import com.wisely.highlight_springmvc4.messageconverter.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("com.wisely.highlight_springmvc4")
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/sse").setViewName("/sse");
    }
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>>converters){
        converters.add(converter());
    }
    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxInMemorySize(1000000);
        return multipartResolver;
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/assets/**").addResourceLocations(
                "classpath:/assets/");// 3

    }
    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {// 2
        registry.addInterceptor(demoInterceptor());
    }
}
