package Lesson18;

public class ArrayCompare {
    public static void main(String[] args) {
        int arrayOne[] = {1,9,3,-8,0,5,4,1};
        int arrayTwo[] = {1,9,3,-8,0,5,4,1};
        int arrayThree[] = arrayTwo;
        System.out.println(arrayOne==arrayTwo);
        /* ответ будет false, потому что хоть два массива
        и одинаковы по структуре, но переменные ссылаются
        на разные объекты
         */
        System.out.println(arrayThree==arrayTwo);
        /* ответ будет true, потому что переменные
        ссылаются на один объект
         */
        System.out.println(arrayOne.equals(arrayTwo));
         /* ответ будет false, потому что метод equals
         в array не перезаписан. Для массивов он работает
         аналогично "=="
         */
        arrayOne[1]=0;
        arrayTwo[5-3]=3; // на месте индекса можем производить любые действия
        arrayOne[arrayOne.length] = 10; // java это пропустит но будет exception, поскольку нет элемента с индексом 8

    }
}
