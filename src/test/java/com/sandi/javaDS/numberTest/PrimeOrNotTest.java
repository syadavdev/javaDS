package com.sandi.javaDS.numberTest;

import com.sandi.javaDS.number.PrimeOrNot;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PrimeOrNotTest {

    @InjectMocks
    PrimeOrNot primeOrNot;

    public static int num;

    @Test
    public void testPrimeOrNot(){
        num = 19;
        Assert.assertEquals(primeOrNot.isPrime(num), true);
    }

    @Test
    public void testPrimeOrNot1(){
        num = 788;
        Assert.assertEquals(primeOrNot.isPrime(num), false);
    }

}
