package com.sandi.javaDS.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class MapTesting {

    public static void main(String...args){
        /*Map<Key, Integer> map = new HashMap();

        Key vishal = new Key("vishal");
        Key vaibhav = new Key("vaibhav");
        Key anand = new Key("anand");


        map.put(vishal, 40);

        map.put(vaibhav, 30);

        map.put(anand, 20);

        map.put(null, 50);



        System.out.println(map.get(anand));*/

        /*List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);

        System.out.println(result);*/

        Predicate<String> stringPredicate = s -> s.equals("a");
        System.out.println(stringPredicate.test("a"));

    }

}

class Key{

    private String name;

    Key(String name){
        this.name = name;
    }

    public boolean equals(Object o){
        return true;
    }

    public int hashCode(){
        return 2;
    }
}
