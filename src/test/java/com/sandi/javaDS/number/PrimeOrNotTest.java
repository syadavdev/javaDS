package com.sandi.javaDS.number;

import org.junit.Assert;
import org.junit.Test;

public class PrimeOrNotTest {

    public static int num;

    public boolean isPrime(int num){
        int sqrt = (int)Math.sqrt(num);
        while(sqrt > 1){
            if(num % sqrt == 0)
                return false;
            sqrt--;
        }
        return true;
    }

    @Test
    public void testPrimeOrNot(){
        num = 19;
        Assert.assertEquals(isPrime(num), true);
    }

    @Test
    public void testPrimeOrNot1(){
        num = 788;
        Assert.assertEquals(isPrime(num), false);
    }

}
