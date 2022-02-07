package Lesson5;

    public class Test20 {

        int summa(int a, int b, int c) { // в скобках - параметры
            int result = a + b + c;
            return result;
        }

        int avAr(int a1, int b1, int c1) {
            int result2 = summa(a1, b1, c1)/3;
            return result2;
        }
    }

    class Test21 {
        public static void main(String[] args) {
            Test20 t = new Test20(); // НЕ ЗАБЫВАЕМ СНАЧАЛА СОЗДАТЬ ОБЪЕКТ КЛАССА ТЕСТ20
            int summaTrexChisel = t.summa(10, 5, 12); // в скобках - аргументы
            System.out.println(summaTrexChisel);
            System.out.println(t.summa(5,15,20)); // в скобках - аргументы
            System.out.println(t.avAr(5,8,5));
        }
    }

