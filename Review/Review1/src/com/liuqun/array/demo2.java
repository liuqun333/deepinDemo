package com.liuqun.array;

//arraycpy方法和使用arraycope自制工具类

public class demo2 {

    public static void main(String[] args) {
        int[] a={0,1,2,3};
        int[] b =new int[4];
        System.arraycopy(a,0,b,0,4);
        for (int i = 0; i <4 ; i++) { System.out.println(b[i]); }
        LQArray lqArray=new LQArray();
        //add
        a=lqArray.add(a,4);
        System.out.println(a[4]);
        System.out.println("------------------");

        //del
        a=lqArray.del(a,4);
        System.out.println(a[3]);
        System.out.println("------------------");


    }
    //刘群Array

    static class LQArray{

        //增加方法 参数是 一个数组和要增加的元素内容
        int[] add(int[] a,int b){
            int[] c=new int[a.length+1];
            System.arraycopy(a,0,c,0,a.length);
            c[c.length-1]=b;
            a=c;
            return a;
        };
        //删除方法 参数是 一个数组和要删除元素的下标
        int[] del (int[] a,int b){
            System.arraycopy(a,b+1,a,b,a.length-(b+1));
            int[] copy  =new int[a.length-1];
            System.arraycopy(a,0,copy,0,copy.length);
            a=copy;
            return  a;
        };
    };
}


/*
	使用arraycopy方法进行数组的拷贝
			语法
				System.arraycopy(要拷贝的数组,从第几个下标开始拷贝,粘贴的数组,从第几个下标开始粘,拷贝几个);
			例子
				//把s1下标为2,3,4的数,拷到s2下标为6,7,8的地方
				System.arraycopy(s1,2,s2,6,3);
		    数组的数据删除
			    数组的删除实际上就是数组自身的拷贝,把要删除数据的后面所有数据拷贝向前一位,把最后一位设置为null,这就就删除数据了
		    数组的插入数据
		    	定义一个比原先数组存放数据多一位的新数组,然后把原先数组拷贝到新数组,然后把要插入的数据位置和后面的数据往后拷贝一位
然后把原本的数据设置成要插入到数据,这样就是数组的插入了
 */
