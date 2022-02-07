package HW;

public class L3operators2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int result = a-- - --a + ++a + a++ + a;
        int bresult = ++b - b++ + ++b - --b;

        System.out.println(result);
        System.out.println(bresult);

    }
}
