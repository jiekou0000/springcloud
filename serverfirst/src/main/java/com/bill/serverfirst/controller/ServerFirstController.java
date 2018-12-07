package com.bill.serverfirst.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerFirstController
 *
 * @author Bill
 * @date 2018/12/7 0007
 */
@RestController
public class ServerFirstController {

    @Value("${server.port}")
    String port;
    @Value("${test.content}")
    String content;

    @RequestMapping("/hello")
    public String home() {
        return "hello " + content + ", I am from port: " + port;
    }
}
