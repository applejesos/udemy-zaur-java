package Lesson4;

public class Car {
    String color = "black";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a; //  поводок без собачки
        Car car1 = new Car();
        Car car2 = car1;
        Car car3; //  поводок без собачки
        car1.color = "red";
        car1.engine = "V8";

        System.out.println(new Car().color); // //  собачка без поводка
        System.out.println("Цвет первого автомобиля: " + car1.color);
        System.out.println("Двигатель первого автомобиля: " + car1.engine);

    }

}
