Урок 5: Создание объектов. Понятие "конструктор". Объявление и вызов методов

Аннотация: default & user defined constructor, return type,  parameter/argument, method creation, method call, differences between method and constructor

Метод обрабатывает какие-либо переменные и отдает нам какое-то output значение.

x, y, z (method's input, ПАРАМЕТРЫ МЕТОДА) -> F(x, y, z) (МЕТОД)-> result (method's output)

Структура метода:
public(1) static(2) void(3) main(4)(String[] args)(5) {our code}(6)

1. Access modifier (речь о них будет в следующих уроках) (необязательно)
2. Non-access modifier(s) (необязательно)
3. Return type
4. Name
5. Parameter(s) - сами скобки обязательны, но необязательно значение в них
6. Body

Создание простого метода (method creation):
    int summa(int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
Вызов этого метода (method call):
    int summaTrexChisel=sum(10,5,12);

Constructor. 

Вспомним из прошлого урока, что:

BankAccount(1) bA(2) = new(4) BankAccount()(3);

1. BankAccount - тип данных переменной (reference type/ссылочный тип). Любой класс является типом данных в Java
2. bA - имя переменной
3. BankAccount - значение (вызов конструктора, создание объекта)
4. new - после него обязательно следует вызов конструктора. New означает, что сейчас будет создаваться новый объект

Обратите внимание, что BankAccount(1) и BankAccount()(3) - это СТРОГО не одно и то же!! Просто существует правило, name of constructor = name of class.

Типы конструктора:
1. Default (создается компилятором, например, Car(){} - конструктор по умолчанию для класса Car. Он не имеет параметров и внутри тела его пусто)
2. User defined (создается нами, может быть с параметрами или без, тело может быть пустым или нет)

Подробнее UD конструктор рассмотрен в Car3.java. 

Difference between method and constructor:

- Method
1. Всегда имеет return type;
2. Можно придумать бесчисленное разнообразие имён;
- Constructor
1. Никогда не имеет return type;
2. Имя должно совпадать с именем класса;

Хорошее упражнение, которое обязательно надо просмотреть еще много раз: Human.java 