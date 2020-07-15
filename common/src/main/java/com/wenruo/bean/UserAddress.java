package com.wenruo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 13:43
 * @version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;
}
