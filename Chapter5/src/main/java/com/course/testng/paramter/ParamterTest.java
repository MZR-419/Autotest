//参数化测试，通过xml文件赋值

package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){

        System.out.println("name = " + name + ";age = " + age);
    }
}
