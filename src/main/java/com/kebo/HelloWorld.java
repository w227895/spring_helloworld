package com.kebo;

/**
 * @description:
 * @Author: kb
 * @Date: 2021-03-13 10:12
 */
public class HelloWorld {
    private String name;
    public void setName(String name) {
        System.out.println("调用了设置属性");
        this.name = name;
    }
    public HelloWorld(){
        System.out.println("初始化构造器");
    }
    public void hello(){
        System.out.println("Hello: " + name);
    }
}