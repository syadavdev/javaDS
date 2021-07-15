package com.sandi.javaDS.arryTest;

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

    void heapify(int[] arry,int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left < n && arry[left] > arry[largest]){
            largest = left;
        }
        if (right < n && arry[right] > arry[largest]){
            largest = right;
        }
        if(largest != i) {
            int temp = arry[largest];
            arry[largest] = arry[i];
            arry[i] = temp;
            heapify(arry,n, largest);
        }
    }

    void heapSort(int arry[]) {
        for(int i = (arry.length/2 - 1); i >= 0 ;i--){
            heapify(arry, arry.length ,i);
        }
        for(int i = arry.length - 1;i >= 0;i--){
            int temp = arry[0];
            arry[0] = arry[i];
            arry[i] = temp;
            heapify(arry, i, 0);
        }
    }

}
