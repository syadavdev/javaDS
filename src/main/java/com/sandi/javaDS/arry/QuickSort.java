package com.sandi.javaDS.arry;

import static com.sandi.javaDS.utils.ArrayCommon.*;

public class QuickSort {

    public static void quickSort(int[] arry, int low, int high){
        if(low < high){
            int divider = partition(arry, low, high);
            quickSort(arry, low, divider - 1);
            quickSort(arry, divider + 1, high);
        }
    }

    public static int partition(int[] arry, int low, int high){
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

    public static int randomizePartition(int[] arry, int low, int high){
        int randomIndex = (int) ((Math.random() * (high - low)) + low);
        exchange (arry, randomIndex, high);
        return partition(arry, low, high);
    }

    public static void randomizeQuickSort(int arry[], int low, int high){
        if(low < high){
            int divider = randomizePartition(arry, low, high);
            randomizeQuickSort(arry, low, divider - 1);
            randomizeQuickSort(arry, divider + 1, high);
        }
    }

}
