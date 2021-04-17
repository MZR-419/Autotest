//依赖测试
package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();   //主动抛出异常
    }

    @Test(dependsOnMethods = {"test1"})   //dependsOnMethods，依赖用法，指定依赖测试方法名称
    public void test2(){
        System.out.println("test2 run");
    }
}
