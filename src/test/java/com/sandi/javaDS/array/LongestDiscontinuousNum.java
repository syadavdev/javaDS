package com.sandi.javaDS.array;

class LongestDiscontinuousNum {

    public static void main(String...args){

        int[] arry = {2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1};

        int count = 1, max = 1, maxElement = arry[0];
        for(int i = 1;i < arry.length - 1;i++){
            if(arry[i] == arry[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count > max){
                max = count;
                maxElement = arry[i];
            }
        }

        System.out.println(maxElement);

    }

}