package Lesson18;

public class StartArray {
    public static void main(String[] args) {
        /* Первый этап создания массивов - объявление (declaration)
        Пока что все они ссылаются на null.
         */
       int [] arrayOne;
       String [] arrayTwo;
       double [][] arrayThree;
       int [][] arrayTen;
       double [] arraySeven;

       /* Второй этап создания массивов - размещение в
        памяти (allocation). Надо указывать размер (длина всегда int)
         */
        arrayOne = new int[8];      // значения по дефолту равны 0
        arrayTwo = new String[3];   // значения по дефолту равны null
        arrayThree = new double[4][2];
        arrayTen = new int[3][];   // вариант создания массива, размерность которого мы знаем не до конца
        arraySeven = new double[7];

        /* Третий этап создания массивов - инициализация (initialization).
        Бывает динамическая и статическая. В этом классе рассмотрена статическая. Динамическу см. в классе "DynamicInit"
         */
        arrayTwo[0] = "privet";
        arrayTwo[1] = "poka";
        arrayTwo[2] = "okay";

        arrayThree[0][0] = 3.14;
        arrayThree[2][1] = 3.14;

        double [] arrayFive;
        arrayFive = new double[2];
        arrayFive[0] = 2.5;
        arrayFive[1] = 3.5;
        arraySeven = arrayFive;

        arrayThree[1] = arrayFive;

        System.out.println(arrayThree[1][0]); // у String length - метод, у массива - переменная, атрибут класса

    }
}
