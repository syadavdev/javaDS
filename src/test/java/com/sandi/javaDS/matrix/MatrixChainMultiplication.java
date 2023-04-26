package com.sandi.javaDS.matrix;

public class MatrixChainMultiplication {

    public static void main(String...args){

        // Matrix with there dimensions
        //      A1      A2       A3
        //    1   2    2   3    3   4
        //   p0   p1  p1   p2  p2    p3

        int p[] =  {1, 2, 3, 4, 5, 6};

        int len = p.length;

        int[][] m = new int[len][len];
        int[][] s = new int[len][len];

        int min, j;

        for(int d = 1; d < len; d++){
            for(int i = 1; i < len - d; i++){
                j = i + d;
                m[i][j] = Integer.MAX_VALUE;
                for(int k = i; k <= j - 1; k++){
                    min = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(min < m[i][j]){
                        m[i][j] = min;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println(m[1][len - 1]);

    }

}
