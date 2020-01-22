//IntelliJ IDEA
//highlight_springmvc4
//UploadController
//2020/1/22
// Author:御承扬
//E-mail:2923616405@qq.com

package com.wisely.highlight_springmvc4.web.ch4_5;


import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){
        try{
            FileUtils.writeByteArrayToFile(new File(
                    "D:\\users\\lenovo\\Spring项目\\uploadfile/"+file.getOriginalFilename()
            ),file.getBytes());
            return "ok";
        } catch (IOException e){
            e.printStackTrace();
            return "wrong";
        }
    }
}
