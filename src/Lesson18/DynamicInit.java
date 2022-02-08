package Lesson18;

/*
В классе рассмотрена динамическая инициализация массивов
*/

public class DynamicInit {
    public static void main(String[] args) {
        String[] arrayOne;
        int[][] arrayTwo;

        arrayOne = new String[3];
        arrayTwo = new int[3][];

        for(int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = "privet" + i;
            System.out.println(arrayOne[i]);
        }
        System.out.println(); // разделитель вывода

        //задаем длину каждого одномерного массива внутри двумерного arrayTwo
        arrayTwo[0] = new int[5];
        arrayTwo[1] = new int[2];
        arrayTwo[2] = new int[7];

        //присваиваем значения
        for(int i = 0; i<arrayTwo.length; i++) {
            for(int j = 0; j<arrayTwo[i].length; j++) {
                arrayTwo[i][j] = i+j;
                System.out.print(arrayTwo[i][j]);
            }
        }


    }
}
