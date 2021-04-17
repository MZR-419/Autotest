//线程组测试，根据xml文件执行启动

package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){

        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){

        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){

        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
