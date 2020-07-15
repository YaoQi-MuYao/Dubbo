package com.wenruo.controller;

import com.wenruo.bean.UserAddress;
import com.wenruo.service.OrderService;
import com.wenruo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 21:55
 * @version: 1.0.0
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/initOrder/{id}")
    public List<UserAddress> initOrder(@PathVariable("id") String id) {
        return orderService.initOrder(id);
    }
}
