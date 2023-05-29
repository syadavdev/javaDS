package com.sandi.javaDS.number;

public class NumberIsPalindrom {

    public static void main(String...args){
       System.out.println(palindrom(100));
    }

    public static boolean palindrom(int x){
        if(x != 0 && x%10 ==0 )
            return false;

        int reverse = 0;
        while(x>reverse){
            reverse = reverse*10 + x%10;
            x/=10;
        }
        return (x==reverse || x==reverse/10);
    }

}
