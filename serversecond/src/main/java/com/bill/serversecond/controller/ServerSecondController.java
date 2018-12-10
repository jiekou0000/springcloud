package com.bill.serversecond.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerSecondController
 *
 * @author Bill
 * @date 2018/12/10 0010
 */
@RestController
public class ServerSecondController {
    @Value("${server.port}")
    String port;
    @Value("${test.content}")
    String content;

    @RequestMapping("/hello")
    public String home() {
        return "hello " + content + ", I am from port: " + port;
    }
}
