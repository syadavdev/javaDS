package com.sandi.javaDS.arryTest;

import org.junit.Assert;
import org.junit.Test;

public class ArrayRotationTest{

    public static int[] arry;
    public static int[] result;
    public static int num;

    @Test
    public void testRotationByNum(){
        arry = new int[]{1,2,3,4,5};
        result = new int[]{3,4,5,1,2};
        num = 2;
        leftRotationByNumber(arry, num);
        Assert.assertArrayEquals(arry, result);
    }

    void leftRotationByNumber(int[] arry, int num){
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
