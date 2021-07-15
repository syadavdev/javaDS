package com.sandi.javaDS.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaFuncation {

    public static void main(String...args){

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Mango"));


        long count = fruits.stream().filter(fruit -> fruit.getName().equals("Apple") ? true : false).count();

        System.out.println(count);

        List<Integer> together = Stream.of(Arrays.asList(5,2), Arrays.asList(3,4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());

        System.out.println(together);

        Integer min = together.stream()
                .min(Comparator.comparing(num -> num))
                .get();
        System.out.println(min);

        int sum = Stream.of(1,2,3)
                .reduce(0, (acc, elem) -> acc + elem);
        System.out.println(sum);
    }

}

class Fruit {

    private String name;

    public String getName(){
        return this.name;
    }

    public Fruit(String name){
        this.name = name;
    }

    public Fruit(){}

}
