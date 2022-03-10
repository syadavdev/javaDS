package com.sandi.javaDS.array;

import org.junit.Assert;
import org.junit.Test;

import static com.sandi.javaDS.utils.ArrayCommon.exchange;

public class QuickSortTest {

    int arry[];
    int result[];

    void quickSort(int[] arry, int low, int high){
        if(low < high){
            int divider = partition(arry, low, high);
            quickSort(arry, low, divider - 1);
            quickSort(arry, divider + 1, high);
        }
    }

    int partition(int[] arry, int low, int high){
        int pivot = arry[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arry[j] <= pivot){
                i++;
                exchange(arry, i, j);
            }
        }
        exchange(arry, i + 1, high);
        return i + 1;
    }

    //Randomize Quick Sort Part :

    int randomizePartition(int[] arry, int low, int high){
        int randomIndex = (int) ((Math.random() * (high - low)) + low);
        exchange (arry, randomIndex, high);
        return partition(arry, low, high);
    }

    void randomizeQuickSort(int arry[], int low, int high){
        if(low < high){
            int divider = randomizePartition(arry, low, high);
            randomizeQuickSort(arry, low, divider - 1);
            randomizeQuickSort(arry, divider + 1, high);
        }
    }

    @Test
    public void testQuickSort(){
        arry = new int[]{45, 12, 3, 45, 178, 44, 56, 87, 43, 1};
        quickSort(arry, 0, arry.length - 1);
        result = new int[]{1, 3, 12, 43, 44, 45, 45, 56, 87, 178};
        Assert.assertArrayEquals(arry, result);
    }

    @Test
    public void testRandomizedQuickSort(){
        arry = new int[]{45, 12, 3, 45, 178, 44, 56, 87, 43, 1};
        randomizeQuickSort(arry, 0, arry.length - 1);
        result = new int[]{1, 3, 12, 43, 44, 45, 45, 56, 87, 178};
        Assert.assertArrayEquals(arry, result);
    }

}
