package com.sandi.javaDS.singleton;

import java.lang.reflect.Constructor;

public class SingletonPattern {

    public static void main(String...args){

        Car objOne = Car.init();
        Car objTwo = null;
        try {
            Constructor constructor = Car.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            objTwo = (Car) constructor.newInstance();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());


        Car objThree = Car.init();
        //Car objFour = (Car) objThree.clone();

        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());

    }

}

class Car {

    private static Car car;

    private Car(){
        System.out.println("Car cons");
    }

    public static Car init(){
        if(car == null){
            synchronized (Car.class) {
                car = new Car();
            }
        }

        return car;
    }

}


