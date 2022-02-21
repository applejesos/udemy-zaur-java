package Lesson7_1;

import Lesson6.Employee;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Lesson7.Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(3, "Petrov", 30, 50500, "IT");
        System.out.println(emp3.department);
        }
}

