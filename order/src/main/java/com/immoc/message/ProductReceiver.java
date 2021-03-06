package com.immoc.message;

import com.immoc.dataobject.ProductInfo;
import com.immoc.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class ProductReceiver {

    private static final  String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message){
        ProductInfo productInfo =(ProductInfo) JsonUtil.fromJson(message, ProductInfo.class);
        log.info("从队列【{}】接收消息:{}" ,"productInfo",productInfo);
        //存储到redis
        stringRedisTemplate.opsForValue().set(
                String.format(PRODUCT_STOCK_TEMPLATE,productInfo.getProductId()),productInfo.getProductStock().toString());
    }


}
