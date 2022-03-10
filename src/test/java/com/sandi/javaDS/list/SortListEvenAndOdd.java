package com.sandi.javaDS.list;

import org.junit.Test;

public class SortListEvenAndOdd {

    @Test
    public void shouldSortEvenAndOrder(){

        int[] arry = {2, 3, 5, 6, 10, 11, 12, 21, 14, 15, 20};

        for(int j = 0; j < arry.length; j++){
            if((arry[j] | 1) == arry[j]) {
                for (int k = j + 1; k < arry.length; k++) {
                    if((arry[k] | 1) > arry[k]) {
                        int temp = arry[k];
                        arry[k] = arry[j];
                        arry[j] = temp;
                    }
                }
            }
        }

        for(int i = 0; i < arry.length; i++)
            System.out.print(arry[i] + " ");

    }

}