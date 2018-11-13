package com.sandi.javaDS.arryTest;

import com.sandi.javaDS.arry.HeapSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HeapSortTest {

    static int[] arry;
    static int[] result;

    @InjectMocks
    HeapSort heapSort;

    @Test
    public void testHeadSort(){
        arry = new int[]{10, 13, 23, 1, 3, 8, 24, 25};
        heapSort.heapSort(arry);
        result = new int[]{1, 3, 8, 10, 13, 23, 24, 25};
        Assert.assertArrayEquals(arry, result);
    }

}
