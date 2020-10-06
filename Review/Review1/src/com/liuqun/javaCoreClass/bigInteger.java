package com.liuqun.javaCoreClass;
//当你要处理的整数甚至超过了long类型的最大范围的时候，可以考虑使用BigInteger

/*
转换为byte：byteValue()
转换为short：shortValue()
转换为int：intValue()
转换为long：longValue()
转换为float：floatValue()
转换为double：doubleValue()
 */
import java.math.BigInteger;


public class bigInteger {
    public static void main(String[] args) {
        //声明一个BigInteger类，赋值
        //pow方式是 a。pow（5）  返回值是a的五次方
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000


        //将普通BigInteger转换成基本数据类型
        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue()); // 123456789000
        System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range


    }

}
