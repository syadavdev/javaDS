package com.sandi.javaDS.string;

public class ReverseStringWithoutMovingNonAlphaChar {

    public static void main(String...args){
        String str = "^sa,$ndeep*&";

        char[] chars = str.toCharArray();

        int left = 0, right = str.length() - 1;

        while(left < right){
            if(!Character.isAlphabetic(chars[left])){
                left++;
            }else if(!Character.isAlphabetic(chars[right])){
                right--;
            }else{
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        System.out.print(chars);
    }

}
