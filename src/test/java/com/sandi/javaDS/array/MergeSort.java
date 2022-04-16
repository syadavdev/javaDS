package com.sandi.javaDS.array;

import org.junit.Test;

public class MergeSort {

    @Test
    public void shouldTest(){
        int[] arry = {10, 45, 23, 67, 78, 234};
        mergeSort(arry, 0, arry.length - 1);
        for(int i = 0;i < arry.length;i++)
            System.out.print("\t" + arry[i]);
    }

    public void mergeSort(int[] arry, int left, int right){
        if(left < right){
            int mid = left + (right - 1)/2;
            mergeSort(arry, left, mid);
            mergeSort(arry, mid + 1, right);
            merge(arry, left, mid, right);
        }
    }

    public void merge(int[] arry, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArry = new int[n1];
        int[] rightArry = new int[n2];

        int i = 0, j = 0, k = left;

        for(;i< n1;i++)
            leftArry[i] = arry[left + i];

        for(;j < n2;j++)
            rightArry[j] = arry[mid + j + 1];

        i = 0;
        j = 0;

        while(i < n1 && j < n2){
            if(leftArry[i] < rightArry[j]) {
                arry[k] = leftArry[i];
                i++;
            }
            else{
                arry[k] = rightArry[j];
                j++;
            }
            k++;
        }

        for(;i < n1;i++,k++){
            arry[k] = leftArry[i];
        }

        for(;j< n2;j++,k++){
            arry[k] = rightArry[j];
        }
    }

}
