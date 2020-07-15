package com.wenruo;

import com.wenruo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 16:33
 * @version: 1.0.0
 */
public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("==================》 调用结束！");
        System.in.read();
    }
}
