package com.zlc.tom;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceIpml  implements  HelloService{

    public  String say(String name){
        return name+",你好";

    }
}
