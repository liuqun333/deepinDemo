package com.liuqun.JavaReflection;

import java.lang.reflect.Field;

//使用Class对象获取class的field信息
/*
    获取字段
        Field getField(name)：根据字段名获取某个public的field（包括父类）
        Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
        Field[] getFields()：获取所有public的field（包括父类）
        Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
        一个Field对象包含了一个字段的所有信息：
            getName()：返回字段名称，例如，"name"；
            getType()：返回字段类型，也是一个Class实例，例如，String.class；
            getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
            get(Object):输入反射类的实例对象 返回字段内容
            set(Object,Object).set方法修改字段值，第一个参数是输入指定实例，第二个参数是要修改成的值

            获取private Fieldh值的时候 需要先设置setAccessible(true)

                    public static void main(String[] args) throws Exceptrr 1ion {
                            Person p = new Person("Xiao Ming");
                            System.out.println(p.getName()); // "Xiao Ming"
                            Class c = p.getClass();
                            Field f = c.getDeclaredField("name");
                            f.setAccessible(true);
                            f.set(p, "Xiao Hong");
                             System.out.println(p.getName()); // "Xiao Hong"
    }
}
 */
public class javaReflectionDemo2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取class对象
        Tony t=new Tony("刘群" ,"12","男");
        Person p=new Person();
        Class tony=t.getClass();
        Class person=p.getClass();


        Field[] fields =tony.getFields();

        Field[] fields1=tony.getDeclaredFields();

        Field[] fields2=person.getDeclaredFields();

        Field field=tony.getField("sexOrgan");



        xh(fields);
        xh(fields1);
        xh(fields2);
        System.out.println("------------------------");
        //获取字段值
        Object value = field.get(t);
        System.out.println(value);
        //设置字段值
        field.set(t,"xdd");
        value = field.get(t);
        System.out.println(value);



    }

    static void xh(Field[] fields){

        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

    }

}

