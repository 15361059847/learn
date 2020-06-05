package com.immoc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by lenovo on 2019/8/22.
 */
@RestController
@Slf4j
@RefreshScope
public class TestController {

    @Value("${test}")
    private String test;

    @GetMapping("/getTest")
    public String getMsg() {
        HashMap map = new HashMap();
        map.put(null,null);
        return test;
    }


}

