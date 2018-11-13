package com.sandi.javaDS.arryTest;

import com.sandi.javaDS.arry.ArrayRotation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ArrayRotationTest{

    @InjectMocks
    ArrayRotation arrayRotation;

    public static int[] arry;
    public static int[] result;
    public static int num;

    @Test
    public void testRotationByNum(){
        arry = new int[]{1,2,3,4,5};
        result = new int[]{3,4,5,1,2};
        num = 2;
        arrayRotation.LeftRotationByNumber(arry, num);
        Assert.assertArrayEquals(arry, result);
    }

}
