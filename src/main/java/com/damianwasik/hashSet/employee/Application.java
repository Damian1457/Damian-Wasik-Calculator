package com.damianwasik.hashSet.employee;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Damian", "Wąsik", 1991, 10, 31);
        Employee employee2 = new Employee("Konrad", "Wąsik", 1992, 11, 10);
        Employee employee3 = new Employee("Izabela", "Wąsik", 1989, 01, 11);
        Employee employee4 = new Employee("Alicja", "Wąsik", 1981, 05, 05);
        Employee employee5 = new Employee("Ewa", "Wąsik", 1987, 07, 15);

        Set<Employee> theEmployee = new HashSet<>();
        theEmployee.add(employee1);
        theEmployee.add(employee2);
        theEmployee.add(employee3);
        theEmployee.add(employee3);
        theEmployee.add(employee4);
        theEmployee.add(employee5);

        for (Employee theNewEmployee : theEmployee) {
            if (theNewEmployee.birthDate.getYear() >= 1990) {
                System.out.println(theNewEmployee);
            }
        }

    }

}
