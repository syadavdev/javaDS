package com.sandi.javaDS.stream;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    public static void main(String...args){

        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple("red", 45.50));
        apples.add(new Apple("red", 45.50));
        apples.add(new Apple("red", 20.50));
        apples.add(new Apple("green", 45.50));
        apples.add(new Apple("red", 10.50));

        Map<Double, List<Apple>> redGroupingByWeight = apples.parallelStream()
                .filter(apple -> apple.color.equals("red") && (apple.weight > 15.00))
                .collect(Collectors.groupingBy(Apple::getWeight));

        redGroupingByWeight.forEach((key, value) -> {
            System.out.println(key +", " + value.get(0).getColor());
        });

        List<String> list = Arrays.asList("Hello ",
                "G", "E", "E", "K", "S!");
        list.parallelStream().forEach(System.out::print);

        list.stream().forEach(System.out::print);

    }

}

class Apple{

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    String color;

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    Double weight;

}