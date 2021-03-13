package com.kebo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @Author: kb
 * @Date: 2021-03-13 10:14
 */
public class ApplicationTest {
    public static void main(String[] args) {
        //1、创建Spring的IOC容器的对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从IOC的容器中获取Bean的实例
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloBean");
        //3、调用hello方法
        helloWorld.hello();
    }
}
