package com.royasoft.gc;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class TestNg {
    @BeforeTest
    public void beforeTset(){
        System.out.println("这是一个beforeTset");
    }


@Test
    public  void caes1(){
        System.out.println("test注解1");
    }
@Test
    public  void testcase2(){
    System.out.println("test注解2");
}
}
