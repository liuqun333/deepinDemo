package com.liuqun.array;

import java.net.BindException;

//数组的定义
public class demo1 {

    public static void main(String[] args) {
        //数组声明方法1
        int[] a = new int[3];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        for (int i = 0; i <3; i++){
            System.out.println(a[i]);
        }
        //数组声明方法2
        String[] b = {"a","b","c"};
        for (int i = 0; i <3; i++) {
            System.out.println(b[i]);
        }
    }
}
