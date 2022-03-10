package com.sandi.javaDS.array;

public class SumOfAnArray {

    public static void main(String...args){
        int[] arry = {2,3,4,5,6,6};

        int sum = arry[0];
        for(int i = 1;i < arry.length; i++){
            sum += arry[i];
        }

        System.out.println(sum + "\n=========================");

        int[][] a = {{2,3,4,3}, {3,4,5,7}, {2,4,5,0}};
        int[][] b = {{2,3,4,5}, {3,4,5,6}, {2,4,5,1}};
        int[][] c = new int[3][4];

        for(int j = 0;j < a.length;j++){
            for(int k = 0;k < a[j].length; k++){
                c[j][k] = a[j][k] + b[j][k];
                System.out.print(c[j][k]+ " ");
            }
            System.out.println("");
        }

    }

}
