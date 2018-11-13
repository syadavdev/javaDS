package com.sandi.javaDS.number;

public class GCDorHCF {

    public int findGCD(int num1, int num2){
        if(num1 % num2 == 0)
            return num2;
        return findGCD(num2, num1%num2);
    }

}
