package Lesson6;

/*
играем с перегруженными конструкторами
 */

public class Employee {

    Employee(int id2, String surname2, int age2) {  // User defined constructor, создающий работничка
        this(id2, surname2, age2, 0.0, null);
    }

    Employee(String surname3, int age3) { // хоть констукторы названы одинаково, но у них разный параметр-лист и разные операции
        this(0, surname3, age3, 0.0, null);

    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) { // подробное описание работы с конструкторами смотри в конспекте по уроку
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    Employee((int id5, String surname5, int age5) {
        id = id5;
        surname = surname5;
        age = age5;
        salary = salary5;
        department = department;
    }

    public Employee() {

    }

    private Employee() {

    }






    String surname;
    public String department;
    int id;
    int age;
    ptivate double salary;

    public void getId() {
        System.out.println("ID: " + id);
    }

    public void getSurname() {
        System.out.println("Surname: " + surname);
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }
}
class EmlpoyeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(3, "Petrov", 30, 50500, "IT");
        System.out.println(emp3.department);
    }
}
