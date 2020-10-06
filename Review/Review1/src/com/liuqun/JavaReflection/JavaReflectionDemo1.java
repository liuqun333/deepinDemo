package com.liuqun.JavaReflection;
//获取Class类

public class JavaReflectionDemo1 {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException {
        //使用class静态变量获取Class类对象
        Class cls1 =Tony.class;
        System.out.println(cls1);

        //使用getClass方法获取Class对象
        Tony t=new Tony("tony","12","男");
        Class cls2 = t.getClass();
        System.out.println(cls2);

        //可以通过静态方法Class.forName()获取Class类对象

        Class cls3 =Class.forName("com.liuqun.JavaReflection.Tony");
        System.out.println(cls3);

    }
}

