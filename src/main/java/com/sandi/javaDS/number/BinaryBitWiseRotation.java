package com.sandi.javaDS.number;

public class BinaryBitWiseRotation {

    public static final int MAX_INT_BIT = 32;

    public int rotateLeft(int num, int d){
        return (num << d)|(num >> (MAX_INT_BIT - d));
    }

    public int rotateRight(int num, int d){
        return (num >> d)|(num << (MAX_INT_BIT - d));
    }

}
