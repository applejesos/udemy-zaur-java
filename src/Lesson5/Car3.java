package Lesson5;

// играемся с констукторами

public class Car3 {
    Car3(String cvet, String motor) { // создаем конструктор с параметрами
        color = cvet; // в этих параметрах мы будем передавать значения для color и engine
        engine = motor;

        System.out.println("Цвет машины: " + color + ", мотор машины: " + engine);
    }

    String color;
    String engine;
}

class carTest{
    public static void main(String[] args) {
        Car3 car1 = new Car3("yellow", "V4"); // создаем объект, внутри () даём аргументы
        Car3 car2 = new Car3("white", "V5");

    }
}
