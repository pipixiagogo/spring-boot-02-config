package com.zh.springboot02config.myConfig;

import com.zh.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: Administrator
 * @Date: 2018/11/10 10:02
 * @Description:
 */

/*
@Configuration:指出该类为一个配置类,来替代之前的Spring配置文件
配置类 添加需要的Bean配置用的
使用这种方式
 */
@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService1(){
        System.out.println("给容器添加组件");
        return new HelloService();
    }

}
