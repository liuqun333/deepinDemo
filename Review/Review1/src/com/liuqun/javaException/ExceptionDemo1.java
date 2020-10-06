package com.liuqun.javaException;

import sun.nio.cs.ext.GBK;

//使用try catch捕获异常
//如果不想捕获，可以使用throws 抛出异常 ，此方法被调用时候，由调用方选择捕获异常还是继续抛出

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        try {
            byte b[]=toBytes("傻逼");
            System.out.println(Arrays.toString(b));
        }catch (UnsupportedEncodingException e){
            System.out.println(e.toString());
        }   

    }


    //将一个String字符转换成字节数组 抛出UnsupportedEncodingException异常
    static byte[] toBytes(String s) throws UnsupportedEncodingException {
      return s.getBytes("GBK");
    }
}

