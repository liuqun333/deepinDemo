package com.liuqun.javaException;

/*
 使用printStackTrace方法 打印异常栈
 捕获异常并再次抛出新的异常时，异常栈会打印原始异常信息；	Caused by:xxx
 通常不要在finally中抛出异常。如果在finally中抛出异常，应该原始异常加入到原有异常中。调用方可通过Throwable.getSuppressed()获取所有添加的Suppressed Exception。




java.lang.NumberFormatException: null
    at java.base/java.lang.Integer.parseInt(Integer.java:614)
    at java.base/java.lang.Integer.parseInt(Integer.java:770)
    at Main.process2(Main.java:16)
    at Main.process1(Main.java:12)
    at Main.main(Main.java:5)

上述异常信息表示：NumberFormatException是在java.lang.Integer.parseInt方法中被抛出的，从下往上看，调用层次依次是：

main()调用process1()；
process1()调用process2()；
process2()调用Integer.parseInt(String)；
Integer.parseInt(String)调用Integer.parseInt(String, int)。

 */
public class ExceptionDemo3 {

    public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            process1();
        }catch (Exception e){
            origin = e;
            System.out.println("catch");
            //可以通过Throwable().getCause()打印原始异常
            System.out.println(new Throwable(e).getCause()+"。。。。。。getcause");
           /*
                finally不抛出异常的时候 使用 e.printStackTrace(); 打印异常栈
                finally抛出异常时，catch不再抛出异常 需要使用origin先保存异常对象 再到finally里用e.addSuppressed(origin);打印异常栈
            */

        }finally {
            System.out.println("finally");
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }

    }
    static void process1(){
        try {
            process2();
        }catch (NullPointerException e){
            throw new  IllegalArgumentException(e);
        }
    }
    static void process2(){
        throw new NullPointerException();
    }
}

