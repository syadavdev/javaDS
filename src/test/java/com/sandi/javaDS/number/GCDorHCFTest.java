package com.sandi.javaDS.number;

import org.junit.Assert;
import org.junit.Test;

public class GCDorHCFTest {

    public static int num1;
    public static int num2;
    public static int result;

    public int findGCD(int num1, int num2){
        if(num1 % num2 == 0)
            return num2;
        return findGCD(num2, num1%num2);
    }

    @Test
    public void testGCDorHCF(){
        num1 = 784;
        num2 = 348;
        result = 4;
        Assert.assertEquals(findGCD(num1, num2), result);
    }

    @Test
    public void testGCDorHCF1(){
        num1 = 17;
        num2 = 19;
        result = 1;
        Assert.assertEquals(findGCD(num1, num2), result);
    }

}
