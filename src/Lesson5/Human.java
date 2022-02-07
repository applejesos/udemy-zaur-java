package Lesson5;

/*
в данном упражнении хорошо рассмотрено
различие конструкторов от методов и то,
как мы передаем значение to reference data type
 */

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void info(){
        System.out.println("Name: " + name + ", car color: " + car.color + ", balance: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human person = new Human();
        person.name = "Nana";
        person.car = new Car4("yellow", "V12");
        person.bA = new BankAccount(4567, 1_567_000);
        person.info();

    }
}

class Car4{
    Car4(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;

}

class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

}
