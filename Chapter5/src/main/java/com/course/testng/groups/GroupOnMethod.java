//方法分组测试

package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")  //(groups = "") 定义组名
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4");
    }

    @BeforeGroups("server")  //tag表示组运行之前的方法
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")   //tag表示组运行之后的方法
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！！！");
    }
}
