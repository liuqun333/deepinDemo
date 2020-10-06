package com.liuqun.javaCoreClass;
/*
  StringJoin可以用来高效的进行字符链接
  构造方法：  StringJoiner（delimiter var）
            添加一个分隔符
            StringJoiner（）
            不添加分隔符
  方法
        add
 */
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("刘群");
        stringJoiner.add("哈哈");
        stringJoiner.add("真帅");
        System.out.println(stringJoiner);
    }
}
