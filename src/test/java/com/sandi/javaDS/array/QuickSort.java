package com.sandi.javaDS.array;

import org.junit.Assert;
import org.junit.Test;

public class QuickSort {

    @Test
    public void shouldTest(){
        int[] arry = new int[]{10, 13, 23, 1, 3, 8, 24, 25};
        quickSort(arry, 0, arry.length - 1);
        int[] result = new int[]{1, 3, 8, 10, 13, 23, 24, 25};
        Assert.assertArrayEquals(arry, result);
    }

    public void quickSort(int[] arry, int low, int high){
        if(low < high){
            int pivot = partition(arry, low, high);
            quickSort(arry, low, pivot - 1);
            quickSort(arry, pivot + 1, high);
        }
    }

    public int partition(int[] arry, int low, int high){

        int pivot = arry[high];
        int i = low - 1;

        for(int j = low;j < high;j++){
            if(arry[j] < pivot){
                i++;
                swap(arry, i, j);
            }
        }

        swap(arry, i+1, high);
        return i+1;
    }

    public void swap(int[] arry, int i, int j){
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
    }

}
