package Lesson6;

public class MethodOverloading {
    void show(int a) {
        System.out.println(a);
    }

    void show(boolean b) {
        System.out.println(b);
    }

    void show(String s) {
        System.out.println(s);
    }

    void show(String s, int a) {
        System.out.println("String: " + s + ", int: " + a);
    }

    void show(int a, String s) {
        System.out.println("Kakoy horoshiy den!");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 600;
        boolean b = true;
        String s = "Privet!";
        mO.show(a);
        mO.show(b);
        mO.show(s);
        mO.show("privet", 10);
        mO.show(10, "privet!");
    }

}
