package com.immoc.repository;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MqSendertest extends OrderDetailRepositoryTest{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","now:" + new Date());
    }

    @Test
    public void send2(){
        amqpTemplate.convertAndSend("myOrder","computer","now:" + new Date());
    }

    @Test
    public void send3(){
        amqpTemplate.convertAndSend("myOrder","fruit","now:" + new Date());
    }
}
