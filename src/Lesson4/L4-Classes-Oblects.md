Урок 4: Понятия "класс" и "объект". Знакомство со ссылочными типами данных

Аналогии:
1) Перед строительством дома нужен чертеж дома. Сам чертеж ничего физического не представляет. ПО чертежу мы планируем создать реальный объект (дом). Чертеж = класс, дом = объект. Классом мы называем какие-то шаблоны. Объектом - производные от класса (экземпляры).
2) В правилах банка прописано, что у банковского счета должны быть три составляющих: айди, имя и баланс. Все счета должны быть построены по этому шаблону - это класс. Существущие счета, имеющие разные данные внутри себя - объекты. 

Dividing into elements and Reusing
- class house (class floor, class door, class wall, class window, class roof)

Structure of Java class
- the package statement 
- the import statement
- class declarations and definitions (переменные (state/состояние), методы (behavior/поведение - производят какие-либо действия с переменными или без), конструктор (позволяет создавать объект класса))
- comments 

Object creation: 

BankAccount(1) bA(2) = new(4) BankAccount()(3);

1. BankAccount - тип данных переменной (reference type/ссылочный тип). Любой класс является типом данных в Java
2. bA - имя переменной 
3. BankAccount - значение (вызов конструктора, создание объекта)
4. new - после него обязательно следует вызов конструктора. New означает, что сейчас будет создаваться новый объект

Difference between primitive and reference data types.
- int a = 10 (наша переменная содержит 10). Примитивных типов данных - 8.
- BankAccount bA (bA содержит F375 (указатель) - область памяти, которая содержит объект). Ссылочных типов данных бесконечное множество

Default значения типов данных. 
Primitive: 
- byte, short, int, long = 0;
- float, double = 0.0;
- char = '\u0000' или 0;
- boolean = false;
Reference: 
- null;

Подробнее о типе String:
Несмотря на то, что String является reference data type, мы можем создать такую переменную без применения слова "new" и вызова конструктора. Она создается так же, как и переменная примитивного типа данных.

Два типа создания объекта String:
1. String name = "Nana";
2. String name = new String("Nana"); 
Разница, конечно, существует, но о ней позже....