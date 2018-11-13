package com.sandi.javaDS.number;

public class PrimeOrNot {

    public boolean isPrime(int num){
        int sqrt = (int)Math.sqrt(num);
        while(sqrt > 1){
            if(num % sqrt == 0)
                return false;
            sqrt--;
        }
        return true;
    }

}
