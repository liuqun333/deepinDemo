package com.liuqun.javaException;

/*
    finally 最终执行语句 不管有没有捕获异常 最后都会执行 finally的内容，他是非必要语句
    catch 的时候记得 先catch exception子类 再catch exception父类 ，效率高
    可以使用逻辑运算符 catch同一级别的Exception
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ExceptionDemo2 {
    public static void main(String[] args)  {
        System.out.println();
        try {
            byte[] b=toBytes("GBK");
        } catch (UnsupportedEncodingException  |  NullPointerException e ) {
            System.out.println(e.toString());
        } catch (IOException e){
            System.out.println();
        }finally {
            System.out.println("END");
        }

    }

    static byte[] toBytes(String s) throws UnsupportedEncodingException {
        return s.getBytes(s);
    }
}
