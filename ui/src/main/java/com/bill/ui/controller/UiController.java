package com.bill.ui.controller;

import com.bill.ui.service.UiServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UiController
 *
 * @author Bill
 * @date 2018/12/10 0010
 */
@RestController
public class UiController {
    @Autowired
    private UiServiceInterface uiServiceInterface;

    @GetMapping(value = "/hello")
    public String hello() {
        return uiServiceInterface.getResultFromClient();
    }
}
