package com.sandi.javaDS.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compare {

    public static void main(String...agrs){

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("Sandi", 5);
        Person p2 = new Person("Sandeep", 4);
        Person p3 = new Person("Sandeep yadav", 3);
        Person p4 = new Person("Sandeep yadav kumar", 2);
        Person p5 = new Person("Sandeep yadav devi kumar", 1);

        personList.add(p1);
        personList.add(p5);
        personList.add(p4);
        personList.add(p3);
        personList.add(p2);

        personList.sort(new NameComparator());
        //Collections.sort(personList);
        personList.forEach(person -> System.out.println(person.name));

        personList.sort(new IdComparator());
        personList.forEach(person -> System.out.println(person.name));
    }

}

class Person implements Comparable<Person>{

    String name;

    Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.name.length(), p.name.length());
    }

}

class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.name.length(), p2.name.length());
    }

}

class IdComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.id, p2.id);
    }

}