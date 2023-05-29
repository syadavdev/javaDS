package com.sandi.javaDS.stream;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String...args){
        Address a1 = new Address("gurgaon", false);
        Address a2 = new Address("bhiwani", false);
        Address a3 = new Address("gurgaon", true);

        List<Address> addresses = new ArrayList();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);

        Employee emp = new Employee("sandeep", "401", addresses);
        Employee emp1 = new Employee("sandi", "402", addresses);
        Employee emp2 = new Employee("santi", "403", addresses);
        Employee emp3 = new Employee("syadav", "404", new ArrayList());

        List<Employee> emps = new ArrayList();
        emps.add(emp);
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        List<Address> result = emps.stream().flatMap(e -> e.addresses.stream())
                .filter(a -> a.city.equals("gurgaon") && a.isDefault)
                .collect(Collectors.toList());

        result.forEach(a -> System.out.println(a.city + " " + a.isDefault));
    }

}

@AllArgsConstructor
class Employee {
    String name;
    String empNo;
    List<Address> addresses;
}

@AllArgsConstructor
class Address {
    String city;
    Boolean isDefault;
}