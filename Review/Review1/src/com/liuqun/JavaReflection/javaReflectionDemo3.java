package com.liuqun.JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    class 获取 method信息

          Method getMethod(name, Class...)：获取某个public的Method,参数是方法名和方法形参列表（包括父类）
          Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
          Method[] getMethods()：获取所有public的Method（包括父类）
          Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）

                    getName()：返回方法名称，例如："getScore"；
                    getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
                    getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
                    getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。
                    invoke[Object object,Class...]:通过invoke调用方法，参数是反射类实例对象和方法实参

                  如果获取到的Method表示一个静态方法，调用静态方法时，由于无需指定实例对象，所以invoke方法传入的第一个参数永远为null。
                  和Field类似，对于非public方法，我们虽然可以通过Class.getDeclaredMethod()获取该方法实例，但直接对其调用将得到一个IllegalAccessException。为了调用非public方法，我们通过Method.setAccessible(true)允许其调用：
                    public class Main {
                        public static void main(String[] args) throws Exception {
                        Person p = new Person();
                        Method m = p.getClass().getDeclaredMethod("setName", String.class);
                            m.setAccessible(true);
                            m.invoke(p, "Bob");
                            System.out.println(p.name);
    }
}
 */
public class javaReflectionDemo3 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Person p = new Person();
        Tony t = new Tony();

        Class person = t.getClass();
        Class tony = t.getClass();

        xh(person.getMethods());
        System.out.println("------------------");
        xh(tony.getDeclaredMethods());


        System.out.println("------------------");
        //反射调用普通方法
        Method method=tony.getMethod("say",String.class,String.class);
        System.out.println(method.invoke(t,"小明","爸爸"));
        //反射调用静态方法



    }

    static void xh(Method[] methods) {
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }


}
