package com.sandi.javaDS.arry;

public class HeapSort{

    public static void heapify(int[] arry,int n, int i) {
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

    public static void heapSort(int arry[]) {
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