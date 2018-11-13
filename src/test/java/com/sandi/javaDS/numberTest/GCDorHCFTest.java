package com.sandi.javaDS.numberTest;

import com.sandi.javaDS.number.GCDorHCF;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class GCDorHCFTest {

    @InjectMocks
    GCDorHCF gcDorHCF;

    public static int num1;
    public static int num2;
    public static int result;

    @Test
    public void testGCDorHCF(){
        num1 = 784;
        num2 = 348;
        result = 4;
        Assert.assertEquals(gcDorHCF.findGCD(num1, num2), result);
    }

    @Test
    public void testGCDorHCF1(){
        num1 = 17;
        num2 = 19;
        result = 1;
        Assert.assertEquals(gcDorHCF.findGCD(num1, num2), result);
    }

}
