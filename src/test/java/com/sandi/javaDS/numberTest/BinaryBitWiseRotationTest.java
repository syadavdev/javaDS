package com.sandi.javaDS.numberTest;

import com.sandi.javaDS.number.BinaryBitWiseRotation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BinaryBitWiseRotationTest {

    @InjectMocks
    BinaryBitWiseRotation binaryBitWiseRotation;

    public static int num;
    public static int d;
    public static int result;

    @Test
    public void testRotateLeft(){
        num = 16;
        d = 2;
        result = 64;
        Assert.assertEquals(binaryBitWiseRotation.rotateLeft(num, d), result);
    }

    @Test
    public void testRotateRight(){
        num = 19;
        d = 3;
        result = 1610612738;
        num = binaryBitWiseRotation.rotateRight(num, d);
        Assert.assertEquals(num, result);
    }

}
