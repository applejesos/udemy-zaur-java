package Lesson6;

public class MethodOverloading2 {
    public int sum(int i1, int i2) {    // разный ретерн тайп (может быть одинаковым)
        return i1+i2;
    }

    protected String sum(String s1, String s2) { // разный аксесс модифаер (может быть одинаковым(
        return s1+s2;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();

        int a = mO2.sum(5, 7);
        System.out.println(a);

        String s = mO2.sum("Privet, ","moy droog!");
        System.out.println(s);
    }
}
