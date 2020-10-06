package com.liuqun.JavaReflection;

class Tony extends Person{

    public String sexOrgan="jj";

    public Tony(String name, String age, String sex) {
        super(name, age, sex);
    }

    public Tony() {

    }


    public void say(String t,String t2){
        System.out.println("我是"+t+"的"+t2);
    }
    private  void psay(){
        System.out.println("悄悄的说，我叫tony");
    }
}
