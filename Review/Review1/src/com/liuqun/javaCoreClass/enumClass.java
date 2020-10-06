package com.liuqun.javaCoreClass;
/*
		当你需要定义一组常量的时候,可以使用枚举类型
                枚举的等级和类是一样的,不管是定义还是调用

 */
public class enumClass {
    public static void main(String[] args) {
        weekday day=weekday.SUN;
        //使用枚举类判断，时间是星期六或者星期天的时候输出休息，其他时间输出上班、
        if (weekday.SUN == day || day == weekday.SAT) {
            System.out.println("休息");
        }else{
            System.out.println("上班");
        }
        //使用普通类判断

        int day2 = weekday2.SUN;
        if (day2==weekday2.SUN || day2==weekday2.SAT){
            System.out.println("休息");
        }else{
            System.out.println("上班");
        }
    }
}

/*
定义一个枚举类，存储时间常量
enum关键词修饰的类是枚举类
 */
enum  weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

/*
除了枚举类，我们用一个普通的类，用 static final修饰的成员来存储常量
 */
 class weekday2{
    public  static  final int SUN = 0;
    public  static  final int MON = 1;
    public  static  final int TUE = 2;
    public  static  final int WED = 3;
    public  static  final int FRI = 4;
    public  static  final int SAT = 5;

}