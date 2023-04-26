package com.sandi.javaDS.array;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondMaxEmployee {

    public static void main(String...args){

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("sam", 1000));
        emps.add(new Employee("bob", 2000));
        emps.add(new Employee("sob", 3000));
        emps.add(new Employee("bos", 5000));

        final Employee employee = emps.stream()
                .sorted((o1, o2) -> Integer.compare(o2.getEmpId(), o1.getEmpId()))
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second max employees using stream : " + employee.getName());

        int[] list = {1000, 2000, 3000, 5000};

        System.out.println("Second max using stream : " +
                Arrays.stream(list).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        List<Address> address = new ArrayList<>();
        address.add(new Address("home"));
        address.add(new Address("office"));
        address.add(new Address("school"));

        Map<String, Address> addressMap = new HashMap<>();
        addressMap.put("home", new Address("home"));
        addressMap.put("office", new Address("office"));
        addressMap.put("school", new Address("school"));

        Student student = new Student("sandeep", address, addressMap);
        address.add(new Address("hospital"));
        student.getAddresses().add(new Address("police"));
        addressMap.put("police", new Address("police"));
        student.getAddressMap().put("police", new Address("police"));
        System.out.println("student address count : " + (long) student.getAddresses().size());
        System.out.println("student address map count : " + (long) student.getAddressMap().entrySet().size());

    }

}

@Getter
class Employee {

    private String name;
    private Integer empId;

//final private List<Address> addresses;

    public Employee(String name, Integer empId){
        this.name = name;
        this.empId = empId;
        //this.addresses = addresses;
    }
}

@Getter
@AllArgsConstructor
class Address {
    String address;
}

@Getter
final class Student {
    final private String name;
    final private List<Address> addresses;
    final private Map<String, Address> addressMap;

    public List<Address> getAddresses(){
        return new ArrayList<>(this.addresses);
    }

    public Map<String, Address> getAddressMap(){
        return new HashMap<>(this.addressMap);
    }

    public Student(String name, List<Address> addresses, Map<String, Address> addressMap){
        this.name = name;
        this.addresses = new ArrayList<>(addresses);
        this.addressMap = new HashMap<>(addressMap);
    }
}