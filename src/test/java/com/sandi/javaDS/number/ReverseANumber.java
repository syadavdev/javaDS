package com.sandi.javaDS.number;

public class ReverseANumber {

    public static void main(String...args){
        int num = 123032176;

        int result = 0, remainder = 0;

        while(num != 0){
            remainder = num%10;
            result = result*10 + remainder;
            num /= 10;
        }
        System.out.print(result);
    }

}
