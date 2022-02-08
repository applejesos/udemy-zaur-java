package HW;

public class L4Student {

    int id;
    String name;
    String surname;
    int course;
    double math;
    double econ;
    double lang;
    double total = math + econ + lang;

    L4Student(String name1, String surname1, int id1, int course1, double math1, double econ1, double lang1) {
        name = name1;
        surname = surname1;
        id = id1;
        course = course1;
        math = math1;
        econ = econ1;
        lang = lang1;
    }

    L4Student(String name2, String surname2, int id2, int course2) {
        this(name2, surname2, id2, course2, 0.0, 0.0, 0.0);
    }

    L4Student() {
    }

}

class StudentTest {

    double newMethod(L4Student st) {
        double nMethod = (st.math + st.econ + st.lang)/3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + ": " + nMethod);
        return nMethod;
    }
    public static void main(String[] args) {

        L4Student st1 = new L4Student("Вася", "Пупкин", 1, 2, 4.2, 4.8, 5.0);

        L4Student st2 = new L4Student("Кеша", "Лупкин", 2, 4);
        st2.econ = 4.2;
        st2.math = 3.9;
        st2.lang = 4.0;
        st2.total = (st2.econ + st2.math + st2.lang)/3;

        L4Student st3 = new L4Student();
        st3.id = 3;
        st3.name = "Тоня";
        st3.surname = "Тупкина";
        st3.course = 4;
        st3.econ = 5.0;
        st3.math = 4.4;
        st3.lang = 5.0;
        st3.total = (st3.econ + st3.math + st3.lang)/3;

       /*
       Старый отстойный клепальщик студентов. Щас пользуемся конструкторами.

        st1.id = 1;
        st1.name = "Вася";
        st1.surname = "Пупкин";
        st1.course = 2;
        st1.econ = 4.8;
        st1.math = 4.2;
        st1.lang = 5;
        st1.total = (st1.econ + st1.math + st1.lang)/3;

        st2.id = 2;
        st2.name = "Кеша";
        st2.surname = "Лупкин";
        st2.course = 4;
        */

        System.out.println("Средняя оценка студента " + st1.name + " " + st1.surname + ": " + st1.total);
        System.out.println("Средняя оценка студента " + st2.name + " " + st2.surname + ": " + st2.total);
        System.out.println("Средняя оценка студента " + st3.name + " " + st3.surname + ": " + st3.total);
        System.out.println();

        StudentTest sTest = new StudentTest();
        sTest.newMethod(st1);
        sTest.newMethod(st2);
        sTest.newMethod(st3);
    }

}
