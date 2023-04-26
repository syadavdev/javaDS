package com.sandi.javaDS.array;

/*input 1 - number of question - like 5
input 2 - array with marks - [4,5,7,4,5]

output - array with distinct number but there total will be minimum.*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class FidelityTest {

    public static void main(String...args){
        int questions = 5;
        int arry[] = {2,3,5,7,8};

        Arrays.sort(arry);
        Arrays.stream(arry).boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        //Map<Integer, Integer> map = new HashMap();

        for(int i = 0;i < questions;i++){
           // map.put()
        }
    }

}
