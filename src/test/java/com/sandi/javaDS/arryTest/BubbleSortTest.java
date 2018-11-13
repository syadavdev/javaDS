package com.sandi.javaDS.arryTest;

import com.sandi.javaDS.arry.BubbleSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BubbleSortTest {

    public static int[] arry;
    public static int[] result;

    @InjectMocks
    BubbleSort bubbleSort;

    @Test
    public void testBubbleSort(){
        arry = new int[]{9,8,7,5,4,3,1};
        result = new int[]{1,3,4,5,7,8,9};
        bubbleSort.bubbleSort(arry);
        Assert.assertArrayEquals(arry, result);
    }

}
