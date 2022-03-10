package com.sandi.javaDS.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String...args){

        List<Integer> number = new ArrayList<>();
        number.add(42);
        number.add(60);
        number.add(80);
        number.add(100);
        number.add(130);
        number.add(200);
        number.add(201);

        Integer findThis = 200;

        System.out.println("Index of "+ findThis + " : " + binarySearch(number, 0, number.size() - 1 , findThis));
    }

    static Integer binarySearch(List<Integer> list, int left, int right, Integer num){
        int mid = (left + right)/2;

        if(num > list.get(mid))
            return binarySearch(list, mid+1, right, num);
        else if(num < list.get(mid))
            return binarySearch(list, left, mid-1, num);
        else
            return mid;
    }

}