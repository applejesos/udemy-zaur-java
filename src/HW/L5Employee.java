package HW;

/*
Создайте класс Employee с атрибутами id, surname, age, salary, department,
которые должны создаваться в конструкторе. В данном классе также создайте
метод увеличение зарплаты вдвое. Создайте второй класс EmployeeTest, в
котором создайте 2 объекта класса Employee. Увеличьте зп каждому
работнику вдвое с помощью метода и выведите на экран значение новой зп.
 */

public class L5Employee {
    public String surname;
    String department;
    int id;
    int age;
    private double salary;

    L5Employee(String surname2, String department2, int id2, int age2, double salary2){
        surname = surname2;
        department = department2;
        id = id2;
        age = age2;
        salary = salary2;
    }

    double salaryUp() {
        salary *= 2;
        return salary;
    }

    public L5Employee(int id3) {
        id = id3;
    }

    public L5Employee(String surname3) {
        surname = surname3;
    }

    private L5Employee(double salary) {
        salary = salary3;
    }

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

class EmployeeTest {
    public static void main(String[] args) {
        L5Employee emp1 = new L5Employee("Bashitov", "IT", 1, 26, 80_000);
        L5Employee emp2 = new L5Employee("Atlan", "IM", 2, 23, 40_000);
        System.out.println("Зарплата работника " + emp1.surname + " до повышения составляет: " + emp1.salary);
        System.out.println("Зарплата работника " + emp2.surname + " до повышения составляет: " + emp2.salary);
        emp1.salaryUp();
        emp2.salaryUp();
        System.out.println("Зарплата работника " + emp1.surname + " до повышения составляет: " + emp1.salary);
        System.out.println("Зарплата работника " + emp2.surname + " до повышения составляет: " + emp2.salary);
    }
}
