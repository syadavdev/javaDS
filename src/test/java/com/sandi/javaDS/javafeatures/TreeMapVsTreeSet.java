package com.sandi.javaDS.javafeatures;

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapVsTreeSet {

    public static void main(String...args){

        final Car kia = new Car("kia", 2017);
        final Car apple = new Car("apple", 2030);
        final Car maruti = new Car("maruti", 2000);

        Map<Car, String> carMap = new TreeMap<>();
        carMap.put(kia, "seltos");
        carMap.put(apple, "icar");
        carMap.put(maruti, "800");
        maruti.year = 2001;
        carMap.put(maruti, "8000");

        for(Map.Entry<Car, String> entry : carMap.entrySet()){
            System.out.println(entry.getKey().modal + entry.getKey().year + " " + entry.getValue() );
        }

        //Stream.of(carMap).reduce();

        /*Set<Car> truckMap = new TreeSet<>();
        truckMap.add(new Car("kia", 2017));
        truckMap.add(new Car("apple", 2030));
        truckMap.add("800");
        truckMap.add("8000");
        truckMap.add("8000");

        for(String name : truckMap){
            System.out.println(name);
        }*/
    }

}

@AllArgsConstructor
class Car implements Comparable<Car> {

    String modal;
    Integer year;

    @Override
    public int compareTo(Car o) {
        if(this.year > o.year)
            return 1;
        else if(this.year < o.year)
            return -1;
        return 0;
    }
}

