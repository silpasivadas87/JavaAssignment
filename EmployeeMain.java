package com.store;
import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Rahul",35000,"IT"));
        list.add(new Employee(2,"Anu",25000,"HR"));
        list.add(new Employee(3,"Arun",45000,"IT"));
        list.add(new Employee(4,"Neha",32000,"Finance"));
        list.add(new Employee(5,"Kiran",27000,"HR"));
        list.add(new Employee(6,"Sara",38000,"IT"));
        list.add(new Employee(7,"Amit",29000,"Finance"));
        list.add(new Employee(8,"John",41000,"HR"));
        list.add(new Employee(9,"Meera",33000,"IT"));
        list.add(new Employee(10,"Ravi",26000,"Finance"));

        System.out.println("Employees with Salary > 30000");

        for (Employee e : list) {

            if (e.salary > 30000) {
                System.out.println(e.name + " " + e.salary);
            }
        }

        System.out.println("\nEmployees Grouped by Department");

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : list) {

            map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }

        for (String dept : map.keySet()) {

            System.out.println(dept);

            for (Employee e : map.get(dept)) {
                System.out.println(e.name);
            }
        }

        System.out.println("\nSorted by Name");

        list.sort(Comparator.comparing(emp -> emp.name));

        for (Employee e : list) {
            System.out.println(e.name);
        }
    }
}