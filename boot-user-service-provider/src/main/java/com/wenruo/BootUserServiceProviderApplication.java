package com.wenruo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、导入依赖
 *      1）、导入dubbo-starter、curator-recipes
 *      2）、在service层的实现类上添加dubbo的@Service注解，不是Spring的，把Spring的@Service注解改为@Component更为直观
 *      3）、在主启动类上添加@EableDubbo的注解开启Dubbo的功能
 * @param:
 * @return:
 * @author: MuYao.Zhang
 * @date: 2020/7/14 22:04
 **/
@EnableDubbo
@SpringBootApplication
public class BootUserServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }
}
