package com.sandi.javaDS.arryTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    public static int[] arry;
    public static int[] result;

    @Test
    public void testBubbleSort(){
        arry = new int[]{9,8,7,5,4,3,1};
        result = new int[]{1,3,4,5,7,8,9};
        bubbleSort(arry);
        Assert.assertArrayEquals(arry, result);
    }

    void bubbleSort(int[] arry){
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
