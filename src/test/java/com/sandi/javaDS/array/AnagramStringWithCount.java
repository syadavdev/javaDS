package com.sandi.javaDS.array;

import java.util.Arrays;

public class AnagramStringWithCount {

    public static void main(String...args){
        String str1="abcdeh", str2="hezla";

        char ar1[] = str1.toCharArray();
        char ar2[] = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);
        int count = 0;
        for(char ch : ar1){
            if(str2.indexOf(ch) == -1){
                count++;
            }
        }

        for(char ch : ar2){
            if(str1.indexOf(ch) == -1){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("apple".indexOf('s'));
    }

}
