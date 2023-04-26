package com.sandi.javaDS.array;

import java.util.Arrays;

public class AnagramString {

    static int NO_OF_CHARS = 256;

    public static void main(String args[]){

        String str1 = "coc";
        String str2 = "ocsc";

        System.out.println(anagram2(str1, str2));

    }

    public static boolean anagram1(String str1, String str2){
        if(str1.length() == str2.length()){
            char[] arry1 = str1.toCharArray();
            char[] arry2 = str2.toCharArray();

            Arrays.sort(arry1);
            Arrays.sort(arry2);

            return Arrays.equals(arry1, arry2);

        }
        return false;
    }

    public static boolean anagram2(String str1, String str2){

        boolean flag = false;

        if(str1.length() == str2.length()){

            int len = str1.length();
            char[] arry1 = str1.toCharArray();
            char[] arry2 = str2.toCharArray();

            char arry[] = new char[NO_OF_CHARS];

            for(int i = 0; i < len; i++){
                arry[arry1[i]]++;
                arry[arry2[i]]--;
            }

            for(int j = 0;j < NO_OF_CHARS; j++){
                if(arry[j] != 0) {
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
        }
        return flag;
    }

}
