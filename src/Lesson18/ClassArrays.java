package Lesson18;

/*
Класс предназнаен для ознакомления с классом Arrays и его двумя методами: sort и binarySearch.
Подробнее см.в readme урока.
*/

import java.util.Arrays;
public class ClassArrays {
    public static void main(String[] args) {
        int arrayOne[] = {1,9,3,-8,0,5,4,1}; // задаем не упорядоченный массив
        for(int i=0; i<arrayOne.length;i++) {
            System.out.print(arrayOne[i] + " ");
        }

        System.out.println();
        Arrays.sort(arrayOne); // сортировка массива от меньшего к большему
        for(int i=0; i<arrayOne.length;i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();

        int indexOne = Arrays.binarySearch(arrayOne, 5); // ищем индекс элемента "5"
        System.out.println(indexOne);
    }
}
