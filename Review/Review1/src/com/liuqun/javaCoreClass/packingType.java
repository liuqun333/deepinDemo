package com.liuqun.javaCoreClass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
    包装类型可以把基本数据类型转换成引用类型
               boolean	 java.lang.Boolean
               byte	     java.lang.Byte
               short	 java.lang.Short
               int	     java.lang.Integer
               long	     java.lang.Long
               float	 java.lang.Float
               double	 java.lang.Double
               char	     java.lang.Character

      valueOf： 静态方法valueOf(int)创建Integer实例:
        int i =1；
        Integer n3 = Integer.valueOf("100");

      int和Integer之间可以自动转换
            自动拆箱：Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing）。
                int i = 100;
                  Integer n = Integer.valueOf(i);
                   int x = n.intValue();
            自动装箱：直接把int变为Integer的赋值写法，称为自动装箱（Auto Boxing）
                 Integer n = 100; // 编译器自动使用Integer.valueOf(int) valueOf：将int转换成Integer
                  int x = n; // 编译器自动使用Integer.intValue()  intValue:讲Integer转换为int
 */
public class packingType {

    public static void main(String[] args) {
        Integer integer = Integer.valueOf(666);
        System.out.println(integer.byteValue());




    }
}
