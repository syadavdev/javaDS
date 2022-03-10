package com.sandi.javaDS.number;

import org.junit.Assert;
import org.junit.Test;

public class BinaryBitWiseRotationTest {

    public static int num;
    public static int d;
    public static int result;

    public final int MAX_INT_BIT = 32;

    public int rotateLeft(int num, int d){
        return (num << d)|(num >> (MAX_INT_BIT - d));
    }

    public int rotateRight(int num, int d){
        return (num >> d)|(num << (MAX_INT_BIT - d));
    }

    @Test
    public void testRotateLeft(){
        num = 16;
        d = 2;
        result = 64;
        Assert.assertEquals(rotateLeft(num, d), result);
    }

    @Test
    public void testRotateRight(){
        num = 19;
        d = 3;
        result = 1610612738;
        num = rotateRight(num, d);
        Assert.assertEquals(num, result);
    }

}
