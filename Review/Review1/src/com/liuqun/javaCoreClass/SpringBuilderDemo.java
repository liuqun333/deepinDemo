package com.liuqun.javaCoreClass;

/*
SpringBuilder ： 可变字符串
构造方法：
    StringBuilder()
        构造一个没有字符的字符串构建器，初始容量为16个字符。
    StringBuilder(int capacity)
        构造一个没有字符的字符串构建器，由 capacity参数指定的初始容量。
    StringBuilder(String str)
        构造一个初始化为指定字符串内容的字符串构建器。
方法：
    append:添加字符
    capacity:返回字符容量
    charat:返回指定索引位置的字符
    deleteCharAt：删除指定索引位置的字符并返回删减后的字符
    delete :删除指定索引范围的字符
 */
public class SpringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder("abcd");
        stringBuilder.append("a");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.charAt(1));
        System.out.println(stringBuilder.deleteCharAt(0));
        System.out.println(stringBuilder.delete(0,1));

    }
}
