package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

//1、参数化
public class DataProviderTest {

    @Test(dataProvider = "data")  //名字与@DataProvider(name = "data")名字相同，获取name，age参数
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name + ";age =" + age);
    }

    @DataProvider(name = "data")    //DataProvider,参数化标签
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}

        };

        return o;

    }

    //2、根据方法名进行参数传递
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1111方法 name="+name+";age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2222方法 name="+name+";age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;

        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",50},
                    {"lisi",25}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }
}