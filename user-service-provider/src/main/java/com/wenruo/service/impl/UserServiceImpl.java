package com.wenruo.service.impl;

import com.wenruo.bean.UserAddress;
import com.wenruo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 14:05
 * @version: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress(1, "北京市", "1", "李老师", "18846090865", "Y");
        UserAddress userAddress1 = new UserAddress(2, "深圳市", "2", "石老师", "15546140532", "Y");
        return Arrays.asList(userAddress,userAddress1);
    }
}
