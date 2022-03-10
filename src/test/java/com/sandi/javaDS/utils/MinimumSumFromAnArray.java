package com.sandi.javaDS.utils;

public class MinimumSumFromAnArray {

    public static void main(String...args){
        //System.out.println(solution((new int[]{4, 2, 3, 7}), 2, 2));
        System.out.println(solution((new int[]{1, 2, 3, 1, 2, 2, 1, 2, 1, 1, 3, 8, 1, 5, 3, 2}), 5, 3));
    }

    public static int solution(int[] A, int X, int Y) {
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            int sum = 0, k = i, j = 0;
            for(; j < X && k < A.length; j++) {
                sum = sum + A[k];
                k = k + Y;
            }
            if(j == X && sum < minSum)
                minSum = sum;
        }

        return minSum;
    }

}