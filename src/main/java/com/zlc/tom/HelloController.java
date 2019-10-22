package com.zlc.tom;

//import com.zlc.tom.rabbit.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    //@Autowired
    //private HelloSender helloSender;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public void say(){
         helloService.say("小明");

    }


   /* @RequestMapping(value = "/rabbit",method = RequestMethod.GET)
    public void rabbit(){
         helloSender.send();

    }*/


    //上传      开始

    @RequestMapping("/index")
    public String index(){
        System.out.println("ddddddddddddddd");
        return "index";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        String filePath = "d:/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
            return "上传成功";
        } catch (IOException e) {
            System.out.println("上传错误");
        }
        return "上传失败！";
    }
    //上传      结束

}
