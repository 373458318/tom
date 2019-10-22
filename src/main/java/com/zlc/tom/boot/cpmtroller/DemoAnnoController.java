package com.zlc.tom.boot.cpmtroller;

import com.zlc.tom.boot.entry.DemoObj;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/demo")
public class DemoAnnoController {

            @RequestMapping(value = "/requestParam") //6
            @ResponseBody
            public  String passRequestParam(Long id, HttpServletRequest request) {
                return "url:" + request.getRequestURL() + " can access";
             }

    @
            RequestMapping(value = "/obj", method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE)//7
            @ResponseBody
            public String passObj(@RequestBody DemoObj obj, HttpServletRequest request) {
                return "url:" + request.getRequestURL()
                        + " can access, obj id: " + obj.getId()+" obj name:"+obj.getName();
            }
}
