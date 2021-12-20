package Lesson18;

/*
В классе проведено поверхностное знакомство с темой Exception. Здесь мы рассматриваем ArrayIndexOutOfBoundsException и
NullPointerException. Код не рабочий, нужен только для ознакомления того, как возникают ошибки.
 */

public class StartException {
    static String s;
    public static void main(String[] args) {
        int[] array = new int[3]; // ArrayIndexOutOfBoundsException
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 5;

        int[][] arrayTwo = new int[3][]; // NullPointerException
        String s;
        //System.out.println(arrayTwo[0][1]); // объект null, т.к. не определен
        //System.out.println(s.length()); // NullPointerException
    }

    }



