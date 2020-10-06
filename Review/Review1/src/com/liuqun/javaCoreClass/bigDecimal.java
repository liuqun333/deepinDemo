package com.liuqun.javaCoreClass;

import java.math.BigDecimal;

/*
和BigInteger类似，BigDecimal可以表示一个任意大小且精度完全准确的浮点数。
scale()方法，返回小数位位数，如果返回负数，例如-2，说明这个数末尾有两个零
stripTrailingZeros()方法，返回末尾去零的BigDecimal  42.4200  返回 42.42


 */
public class bigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("123456.123456");
        System.out.println(bigDecimal.scale());

        BigDecimal bigDecimal2 = new BigDecimal("123456.123456000");
        System.out.println(bigDecimal2.stripTrailingZeros());






    }
}
