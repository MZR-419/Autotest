//套件测试
//忽略测试 enabled = false：表示忽略此tag下的测试，不传默认为true。
package com.course.testng.suite;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");

    }

    @Test
    public void ignore3(){

        System.out.println("ignore3 执行");
    }
}
