package com.sandi.javaDS.arry;

public class BubbleSort {

    public void bubbleSort(int[] arry){
        int length = arry.length, j;
        boolean isSwap = true;
        while(isSwap){
            isSwap = false;
            for(j = 0;j < length - 1;j++){
                if(arry[j] > arry[j+1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                    isSwap = true;
                }
            }
            length--;
        }
    }

}