package com.wenruo.service.impl;

import com.wenruo.bean.UserAddress;
import com.wenruo.service.OrderService;
import com.wenruo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 14:12
 * @version: 1.0.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    /**
     * @Reference注解是dubbo的注解：是用来在注册中心自动发现所需的接口
     */
    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        System.out.println("用户ID：" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress: userAddressList) {
            System.out.println(userAddress);
        }
        return userAddressList;
    }
}
