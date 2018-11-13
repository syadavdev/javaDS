package com.sandi.javaDS.arry;

public class ArrayRotation {

    public void LeftRotationByNumber(int[] arry, int num){
        int length = arry.length;
        if(num > length)
            num = length % num;
        while(num > 0){
            int i = 0;
            int temp = arry[i];
            for(i = 0; i < length-1;i++){
                arry[i] = arry[i+1];
            }
            arry[i] = temp;
            num--;
        }
    }

}
