package com.liuqun.array;
//冒泡排序
public class demo3 {

    public static void main(String[] args) {

        int[] arr={5,1,4,7,2,3,8,9,17,35,21,27,31,64,2,456,234,785};
        arr=sort(arr);
        for (int i:arr) {
            System.out.println(i);
        }

    }

    static int[] sort(int[] arr){
        for (int i = 1; i <arr.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        return  arr;
    };
}

