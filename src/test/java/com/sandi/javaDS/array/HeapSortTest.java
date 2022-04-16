package com.sandi.javaDS.array;

import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest {

    static int[] arry;
    static int[] result;

    @Test
    public void testHeadSort(){
        arry = new int[]{10, 13, 23, 1, 3, 8, 24, 25};
        heapSort(arry);
        result = new int[]{1, 3, 8, 10, 13, 23, 24, 25};
        Assert.assertArrayEquals(arry, result);
    }

    public void heapify(int[] arry, int size, int index){
        int left = index*2 + 1;
        int right = index*2 + 2;
        int largest = index;

        if(left < size && arry[left] > arry[largest])
            largest = left;

        if(right < size && arry[right] > arry[largest])
            largest = right;

        if(largest != index){
            int temp = arry[largest];
            arry[largest] = arry[index];
            arry[index] = temp;
            heapify(arry, size, largest);
        }

    }

    public void heapSort(int[] arry){
        for(int i = (arry.length)/2 - 1; i >= 0; i--)
            heapify(arry, arry.length, i);

        for(int i = arry.length - 1; i > 0; i--){
            int temp = arry[i];
            arry[i] = arry[0];
            arry[0] = temp;
            heapify(arry, i, 0);
        }
    }

}
