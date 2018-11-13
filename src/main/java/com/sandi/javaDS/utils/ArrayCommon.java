package com.sandi.javaDS.utils;

public class ArrayCommon {

    public static void printArray(int arry[]){
        for(int i = 0;i < arry.length;i++)
            System.out.print(arry[i]+" ");
    }

    public static void exchange(int arry[], int a, int b){
        int temp = arry[a];
        arry[a] = arry[b];
        arry[b] = temp;
    }

}
