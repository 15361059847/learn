package com.immoc.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Slf4j
public class MqReceiver {

//    @RabbitListener(queues = "myQueue")
//    自动创建队列
//    @RabbitListener(queuesToDeclare = @Queue("myQueue2"))
//    自动创建，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")

    ))
    public void process(String message){
        log.info("MqReceiver;{}" + message);
    }

    /**
     * demo2
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "computer",
            value = @Queue("computerOrder")
    ))
    public void process2(String message){
        log.info("computer MqReceiver;{}" + message);
    }

    /**
     * demo3
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "fruit",
            value = @Queue("fruitOrder")
    ))
    public void process3(String message){
        log.info("fruit MqReceiver;{}" + message);
    }
}
