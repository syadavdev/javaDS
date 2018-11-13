package com.sandi.javaDS.arryTest;

import com.sandi.javaDS.arry.QuickSort;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

public class QuickSortTest {

    int arry[];
    int result[];

    @InjectMocks
    QuickSort quickSort;

    @Test
    public void testQuickSort(){
        arry = new int[]{45, 12, 3, 45, 178, 44, 56, 87, 43, 1};
        quickSort.quickSort(arry, 0, arry.length - 1);
        result = new int[]{1, 3, 12, 43, 44, 45, 45, 56, 87, 178};
        Assert.assertArrayEquals(arry, result);
    }

    @Test
    public void testRandomizedQuickSort(){
        arry = new int[]{45, 12, 3, 45, 178, 44, 56, 87, 43, 1};
        quickSort.randomizeQuickSort(arry, 0, arry.length - 1);
        result = new int[]{1, 3, 12, 43, 44, 45, 45, 56, 87, 178};
        Assert.assertArrayEquals(arry, result);
    }

}
