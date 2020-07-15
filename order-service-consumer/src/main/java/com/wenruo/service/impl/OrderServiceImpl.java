package com.wenruo.service.impl;

import com.wenruo.bean.UserAddress;
import com.wenruo.service.OrderService;
import com.wenruo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 14:12
 * @version: 1.0.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    UserService userService;

    public void initOrder(String userId) {

        System.out.println("用户ID：" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress: userAddressList) {
            System.out.println(userAddress);
        }
    }
}
