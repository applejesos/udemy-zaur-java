package HW;

public class L6FiveOverLoadMeth {
    int a, b, c, d;

    int methodSum() {
        int result = 0;
        System.out.println("Сумма всех чисел равна: " + result);
        return 0;
    }

    int methodSum(int a1) {
        int result1  = a1;
        System.out.println("Сумма всех чисел равна: " + result1);
        return result1;
    }

    int methodSum(int a2, int b2) {
        int result2  = a2 + b2;
        System.out.println("Сумма всех чисел равна: " + result2);
        return result2;
    }

    int methodSum(int a3, int b3, int c3) {
        int result3  = a3 + b3 + c3;
        System.out.println("Сумма всех чисел равна: " + result3);
        return result3;
    }

    int methodSum(int a4, int b4, int c4, int d4) {
        int result4  = a4 + b4 + c4 + d4;
        System.out.println("Сумма всех чисел равна: " + result4);
        return result4;

    }
}

class L6FiveOverLoadMethTest {
    public static void main(String[] args) {
        L6FiveOverLoadMeth obj = new L6FiveOverLoadMeth();

        obj.methodSum();
        obj.methodSum(1);
        obj.methodSum(1,2);
        obj.methodSum(1,2,3);
        obj.methodSum(1,2,3,4);
    }

}
