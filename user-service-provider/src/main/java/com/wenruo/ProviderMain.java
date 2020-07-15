package com.wenruo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:
 * @author: MuYao
 * @date: Created in 2020/7/14 14:54
 * @version: 1.0.0
 */
public class ProviderMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();

    }
}
