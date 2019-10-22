/*
package com.zlc.tom.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {

        System.out.println("发送到消息队列的是 : 我发送了一条信息" );
        this.rabbitTemplate.convertAndSend("hello", "我发送了一条信息");
    }

}*/
