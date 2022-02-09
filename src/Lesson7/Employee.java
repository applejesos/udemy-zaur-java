package Lesson7;

public class Employee {
    private double salary;

    private void dvoynayaZP(){
        System.out.println("Novaya zp: " + salary*2);
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee m = new Employee(500);
        System.out.println(m.salary);
        m.dvoynayaZP();
        }
    }

    class EmployeeTest {
        public static void main(String[] args) {
            Employee m = new Employee(500);
            System.out.println(m.salary);
            m.dvoynayaZP();
        }
    }
