package com.immoc.message;

import com.immoc.dataobject.ProductInfo;
import com.immoc.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ProductReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message){
        ProductInfo productInfo =(ProductInfo) JsonUtil.fromJson(message, ProductInfo.class);
        log.info("从队列【{}】接收消息:{}" ,"productInfo",productInfo);
        //
    }


}
