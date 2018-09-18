package com.hx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yxqiang
 * @create 2018-09-18 22:43
 */

/*
* @SpringBootApplication 标注一个主程序类，说明这是一个SpringBoot应用
* */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
