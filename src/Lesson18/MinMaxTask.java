package Lesson18;

/*
В классе рассмотрена задача по нахождению минимального и максимального значения массива.
*/

public class MinMaxTask {
    public static void maxMin(double[] array) {
        double max=array[0];
        double min=array[0];
        for(int i=1; i<array.length;i++) { // работаем с 1-м элементов, т.к. нулевой уже присвоен как max и min

            if(array[i]>max) {
                max=array[i];
            }
            if(array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min + ". Максимальный элемент массива: " + max +".");
    }

    public static void main(String[] args) {
        double[] arrayOne = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(arrayOne);
        maxMin(new double[] {2.5, -1.3});
    }
}
