Урок 6: перегрузка методов и конструкторов (overloading). Ключевое слово this

Аннотация: method overloading, constructor overloading, "this" statement, runtime & compile time error

##Method Overloading 

Сразу пример: вот мы создали три разных метода, которые, в принципе, делают одно и то же:
```
void showInt(int a) {
    System.out.println(a);
    }

void showBoolean(boolean b) {
    System.out.println(b);
    }

void showString(String s) {
    System.out.println(s);
    }
   
```

Было бы круто создать из всех них один общий метод.
```
void show(int a) {
    System.out.println(a);
    }

void show(boolean b) {
    System.out.println(b);
    }

void show(String s) {
    System.out.println(s);
    }
}
```
Такой код работает без проблем, потому что компидятор смотрит не только на имя метода, но и на аргумент. То есть в том случае, если мы обращаемся к неуникальному по имени методу, у него просто не может быть такого же неуникального параметра - Java не поймет, с чем конкретно надо работать.

В этом и заключается суть метода overloading - создани методов с одинаковым названием, но с разными параметрами. Существуют перегруженные методы:
1. С разными типами данных: 
```
void method (int a, String b) {}
void method (double a, double b) {} 
```
2. С разным количеством параметров:
```
void method (int a, int b) {}
void method (int a, int b, int c) {} 
```
3. С разным порядком параметров:
```
void method (int a, String b) {}
void method (String a, int b) {} 
```

###Rules of overloading:
1. Return type может быть одинаковый или различный (mo.java - rt одинаковый, mo2.java - rt разный):
```
void method (int a, String b) {}
void method (double a, boolean b) {} 
int method (long a) {return 5}
```
2. Access modifier может быть одинаковый или различный:
```
public void method (int a, int b) {}
private void method (int a, int b, int c) {}
public int method (long a) {return 5}
```
3. Методы, отличающиеся только return type или access modifier НЕ ЯВЛЯЮТСЯ OVERLOADED (COMPILE ERROR):
```
public void method (int a, String b) {}
private void method (int a, String b) {}
public String method (int a, String b) {return "a";}
```

###Constructor Overloading
Перегруженный конструкторы имеют разный список параметров.

1. С разными типами данных:
```
Constructor (int a, String b) {}
Constructor (double a, double b) {} 
```
2. С разным количеством параметров:
```
Constructor (int a, int b) {}
Constructor (int a, int b, int c) {} 
```
3. С разным порядком параметров:
```
Constructor (int a, String b) {}
Constructor(String a, int b) {} 
```
###Rules of Overloading
1. Access modifier может быть одинаковый или различный:
```
public Constructor (int a, int b) {}
private Constructor (int a, int b, int c) {}
public Constructor (long a) {}
```
2. Конструкторы, отличающиеся только access modifier НЕ ЯВЛЯЮТСЯ OVERLOADED (COMPILE ERROR):
```
public Constructor (int a, String b) {}
private Constructor (int a, String b) {}
public Constructor (int a, String b) {}
```

##This 

Чтобы избежать вечного копипэйста, было бы круто попытаться вызвать один констуктор внутри другого: 
```
Employee(int id2, String surname2, int age2) {  
    Employee(surname2,  age2); // вызываем внутри первого констуктора второй, заменяя параметры на нужные
    id = id2;
}

Employee(String surname3, int age3) { // хоть констукторы названы одинаково, но у них разный параметр-лист и разные операции
    surname = surname3;
    age = age3;
    }
```
Не выходит - компилятор ругается. Дело в том, что мы **не можем вызывать внутри тела конструктора его overloaded конструктор по имени класса**. Java компилятор не дает это сделать.
Но! Для таких целей есть **this**. 
```
Employee(int id2, String surname2, int age2) {  
    this(surname2,  age2); // вызываем внутри первого констуктора второй, заменяя параметры на нужные
    id = id2;
}

Employee(String surname3, int age3) { // хоть констукторы названы одинаково, но у них разный параметр-лист и разные операции
    surname = surname3;
    age = age3;
    }
```

THIS - вызов overloaded констуктора внутри конструктора. Java понимает, о каком конкретно overloaded constructor идет речь по параметрам :)

Используйте this на первой строке (на первом стэйтменте) в теле для вызова overloaded конструктора внутри конструктора:
```
public Constructor(int a) {}
private Constructor(int a, String b) { 
    this(5);
        System.out.println("It's correct!");
        }
```

Теперь рассмотрим повнимательнее работу с вложенными конструкторами. Можно так: 
```
Employee(int id2, String surname2, int age2) {  // User defined constructor, создающий работничка
    this(surname2,  age2); // вызываем внутри первого констуктора второй, заменяя параметры на нужные
    id = id2;
    }

Employee(String surname3, int age3) { // хоть констукторы названы одинаково, но у них разный параметр-лист и разные операции
     surname = surname3;
     age = age3;
     }

Employee(int id4, String surname4, int age4, double salary4, String department4) {
     this(id4, surname4, age4);
     salary = salary4;
     department = department4;
     }
```
Все, в принципе работает, но код не из лучших, почему - понятно. Куда более изящным решением будет следуюющее:
```
Employee(int id2, String surname2, int age2) {  // User defined constructor, создающий работничка
    this(id2, surname2, age2, 0.0, null);
    }

Employee(String surname3, int age3) { // хоть констукторы названы одинаково, но у них разный параметр-лист и разные операции
    this(0, surname3, age3, 0.0, null);
    }

Employee(int id4, String surname4, int age4, double salary4, String department4) {
     id = id4;
     surname = surname4;
     age = age4;
     salary = salary4;
     department = department4;
    }
```
Первым делом тут мы описываем самый объемный конструктор (последний).  И его уже вкладываем в другие, задавая отсутствующие параметры значениями по умолчанию.

Это далеко не вся функциональность слова **this**, но об этом в дальнейших уроках.