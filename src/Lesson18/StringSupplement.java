package Lesson18;

/*
В классе рассмотрены дополнения к предыдущему уроку (String и StringBuilder): еще один конструктор, методы append и insert.
*/

public class StringSupplement {
    public static void main(String[] args) {

        // еще один конструктор класса String
        char[] array={'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        //рассмотрим метод append
        StringBuilder sb = new StringBuilder("Hello, world!");
        sb.append(array, 2, 3); // первый пар. - что мы используем, второй -
        System.out.println(sb);
        /* к "Hello,  World!" добавится "ive". Это второй параметр метода append. Он
        говорит, с какой позиции массива мы добавляем значение (второе, с буквы i), а
        третий параметр говорит, сколько значений, включая второе, мы добавим - 3.
         */

        //рассмотрим метод insert
        sb.insert(2, array, 1, 3);
        System.out.println(sb);
        /*метод добавляет ко второй позиции массива sb (между 'e' и 'l') элементы
        массива array с первой позиции массива ('r'). Четвертый параметр отвечает за
        то, сколько элементов мы добавляем - 3 ('r','i','v').
         */
    }
}
