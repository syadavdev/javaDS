package com.sandi.javaDS.array;

public class AllAlphabatesInString {

    public static void main(String...args){
        final String str = "qqqqqqqqqqwertyuiooop[asdfghjkl;zxcvbnm,";
        final char[] arry = str.toCharArray();

        int[] visited = new int[26];

        for(char ch : arry){
            if('a' <= ch && ch <= 'z'){
                visited[ch - 'a'] = 1;
            }
        }

        for(int visit : visited){
            if(visit != 1){
                System.out.println("Not present");
                break;
            }
        }

    }

}
