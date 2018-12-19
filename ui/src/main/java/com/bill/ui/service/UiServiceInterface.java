package com.bill.ui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UiServiceInterface
 *
 * @author Bill
 * @date 2018/12/10 0010
 */
@FeignClient(value = "serverfirst", fallback = UiServiceHystrix.class)
public interface UiServiceInterface {
    @GetMapping(value = "/hello")
    String getResultFromClient();
}
