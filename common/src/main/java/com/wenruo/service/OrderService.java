package com.wenruo.service;

import com.wenruo.bean.UserAddress;

import java.util.List;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 14:11
 * @version: 1.0.0
 */
public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
