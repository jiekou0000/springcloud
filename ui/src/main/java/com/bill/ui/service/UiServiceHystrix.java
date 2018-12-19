package com.bill.ui.service;

import org.springframework.stereotype.Service;

/**
 * UiServiceHystrix
 *
 * @author Bill
 * @date 2018/12/10 0010
 */
@Service
public class UiServiceHystrix implements UiServiceInterface {
    @Override
    public String getResultFromClient() {
        return "server first sorry !";
    }
}
