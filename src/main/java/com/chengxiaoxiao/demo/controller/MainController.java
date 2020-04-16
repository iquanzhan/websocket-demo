package com.chengxiaoxiao.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Random;

/**
 * @Author: Cheng XiaoXiao  (🍊 ^_^ ^_^)
 * @Date: 2020/4/16 10:56 下午
 * @Description:
 */
@Controller
public class MainController {
    @MessageMapping("/welcome")//1
    @SendTo("/topic/server")//2
    public String say(String message) throws Exception {
        float v = new Random().nextFloat();
        return v + "";
    }
}
