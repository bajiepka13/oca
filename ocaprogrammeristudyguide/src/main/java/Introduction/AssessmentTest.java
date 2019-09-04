package Introduction;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

public class AssessmentTest {

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
        question17();
        question18();
        question19();
        question20();
    }

    /*
    Which of the following are checked exceptions? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. Exception                    - correct
    B. IllegalArgumentException
    C. IOException                  - correct
    D. NullPointerException
    E. NumberFormatException
    F. StackOverflowError
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question20() {

    }

    /*
    19. Bytecode is in a file with which extension?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. .bytecode
    B. .bytes
    C. .class   - correct
    D. .exe
    E. .javac
    F. .java
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
    private static void question19() {

    }

    /*
    18. Which of the following print out a date representing April 1, 2015? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
    B. System.out.println(LocalDate.of(2015, Month.APRIL, 1));      - correct
    C. System.out.println(LocalDate.of(2015, 3, 1));
    D. System.out.println(LocalDate.of(2015, 4, 1));                - correct
    E. System.out.println(new LocalDate(2015, 3, 1));
    F. System.out.println(new LocalDate(2015, 4, 1));
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Варианты ответов E,F не скомпилируются, т.к. у класса LocalDate указанный конструктор  является
    приватным, соответственно мы не получим даже ссылку из-за ошибки компиляции. У вариантов  A и D
    указан март в конструкторе: в D - явно, а в A у календаря тоже какой-то прикол.
    */
    private static void question18() {
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
//        System.out.println(new LocalDate(2015, 3, 1));
//        System.out.println(new LocalDate(2015, 4, 1));
    }

    /*
    Which of the following lines can be inserted at line 11 to print true? (Choose all that
    apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    10: public static void main(String[] args) {
    11: // INSERT CODE HERE
    12: }
    13: private static boolean test(Predicate<Integer> p) {
    14: return p.test(5);
    15: }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. System.out.println(test(i -> i == 5));               - correct
    B. System.out.println(test(i -> {i == 5;}));
    C. System.out.println(test((i) -> i == 5));             - correct
    D. System.out.println(test((int i) -> i == 5);
    E. System.out.println(test((int i) -> {return i == 5;}));
    F. System.out.println(test((i) -> {return i == 5;}));   - correct
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Предикат, создаваемый лямбдой не верный в случае B - так как если взять выражение в ско-
    бки, и использовать указанную реализацию, то не хватает return выражения. Варианты С, D
    также не скомпилируются, т.к. в метод test передаются значения примитивного типа,  одно-
    временно с этим сигнатура метода принимает только тип-обёртку и в таких случаях не  пре-
    дусмотрено boxing / unboxing операций. Чтобы эти два варианта скомпилировались нужно за-
    менить примитивный тип на его тип-обёртку
    */
    private static void question17() {
        System.out.println(test(i -> i == 5));
//        System.out.println(test(i -> {i == 5;}));     выражение не возвращает результата
        System.out.println(test((i) -> i == 5));
//        System.out.println(test((int i) -> i == 5));  в выражении не происходит unboxing / boxing
//        System.out.println(test((int i) -> {return i == 5;}));    в выражении не происходит unboxing / boxing
        System.out.println(test((i) -> {return i == 5;}));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }

    /*
    What individual changes, if any, would allow the following code to compile? (Choose all
    that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public interface Animal { public default String getName() { return null; } }
    2: interface Mammal { public default String getName() { return null; } }
    3: abstract class Otter implements Mammal, Animal {}
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. The code compiles without issue.
    B. Remove the default method modifier and method implementation on line 1.
    C. Remove the default method modifier and method implementation on line 2.
    D. Remove the default method modifier and method implementation on lines 1 and 2.
    E. Change the return value on line 1 from null to "Animal".xxxviii Introduction
    F. Override the getName() method with an abstract method in the Otter class.
    G. Override the getName() method with a concrete method in the Otter class.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
    private static void question16() {

    }

    /*
    Which of the following statements can be inserted in the blank line so that the code will
    compile successfully? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public interface CanSwim {}
    public class Amphibian implements CanSwim {}
    class Tadpole extends Amphibian {}
    public class FindAllTadPole {
    public static void main(String[] args) {
    List<Tadpole> tadpoles = new ArrayList<Tadpole>();
    for(Amphibian amphibian : tadpoles) {
    ___________ tadpole = amphibian;
    } } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. CanSwim
    B. Long
    C. Amphibian
    D. Tadpole
    E. Object
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question15() {

    }

    /*
    Assuming we have a valid, non-null HenHouse object whose value is initialized by the
    blank line shown here, which of the following are possible outputs of this application?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    (Choose all that apply)
    1: class Chicken {}
    2: interface HenHouse { public java.util.List<Chicken> getChickens(); }
    3: public class ChickenSong {Introduction xxxvii
    4: public static void main(String[] args) {
    5: HenHouse house = ______________
    6: Chicken chicken = house.getChickens().get(0);
    7: for(int i=0; i<house.getChickens().size();
    8: chicken = house.getChickens().get(i++)) {
    9: System.out.println("Cluck");
    10: } } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. The code will not compile because of line 6.
    B. The code will not compile because of lines 7–8.
    C. The application will compile but not produce any output.
    D. The application will output Cluck exactly once.
    E. The application will output Cluck more than once.
    F. The application will compile but produce an exception at runtime
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question14() {

    }

    /*
    What is the output of the following program?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class BearOrShark {
    2: public static void main(String[] args) {
    3: int luck = 10;
    4: if((luck>10 ? luck++: --luck)<10) {
    5: System.out.print("Bear");
    6: } if(luck<10) System.out.print("Shark");
    7: } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. Bear
    B. Shark
    C. BearShark
    D. The code will not compile because of line 4.
    E. The code will not compile because of line 6.
    F. The code compiles without issue but does not produce any output.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question13() {

    }

    /*
    What is the result of the following program?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class Egret {
    2: private String color;
    3: public Egret() {
    4: this("white");
    5: }
    6: public Egret(String color) {
    7: color = color;
    8: }
    9: public static void main(String[] args) {
    10: Egret e = new Egret();
    11: System.out.println("Color:" + e.color);
    12: }
    13: }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. Color:
    B. Color:null   - correct
    C. Color:White
    D. Compiler error on line 4.
    E. Compiler error on line 10.
    F. Compiler error on line 11.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    При инициализации нового экземпляра Erget  в
    конструкторе с параметров компилятор не при-
    сваивает никакого значения свойству color,
    т.к. значение входящего аргумента переназна-
    чается само себе... Чтобы этого не было, на-
    до указывать this.color = color. Т.к. из-за
    этого значение не инициализировано, то  при
    обращении к свойству объекта при sout мы по-
    лучаем null
    */
    private static void question12() {

    }

    /*
    What is the output of the following program?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class FeedingSchedule {
    2: public static void main(String[] args) {
    3: int x = 5, j = 0;
    4: OUTER: for(int i=0; i<3; )
    5: INNER: do {
    6: i++; x++;
    7: if(x > 10) break INNER;
    8: x += 4;
    9: j++;
    10: } while(j <= 2);
    11: System.out.println(x);
    12: } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. 10
    B. 12   - correct
    C. 13
    D. 17
    E. The code will not compile because of line 4.
    F. The code will not compile because of line 6.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Ярлыки OUTER и INNER в пинципе не играют ни-
    какой роли. "Сюрприз" данного задания в том,
    что после того, как вызов выходит из второй
    итерации в INNER, то значение i уже превыша-
    ет значение OUTER цикла. Соответственно зде-
    сь нужно корректно себе представить как  из-
    меняются значения переменных...
    */
    private static void question11() {

    }

    /*
    Which are true of the following code? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: import java.util.*;
    2: public class Grasshopper {
    3: public Grasshopper(String n) {
    4: name = n;
    5: }
    6: public static void main(String[] args) {
    7: Grasshopper one = new Grasshopper("g1");
    8: Grasshopper two = new Grasshopper("g2");
    9: one = two;
    10: two = null;
    11: one = null;
    12: }
    13: private String name; }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.
    B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.
    C. Immediately after line 9, only one grasshopper object is eligible for garbage collection.
    D. Immediately after line 10, only one grasshopper object is eligible for garbage collection.
    E. Immediately after line 11, only one grasshopper object is eligible for garbage collection.
    F. The code compiles.
    G. The code does not compile.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question10() {

    }

    /*
    Which of the following statements are true? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
    B. Checked exceptions are required to be caught or declared.
    C. Errors are intended to be thrown by the JVM (and not the programmer).
    D. Errors are required to be caught or declared.
    E. Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
    F. Runtime exceptions are required to be caught or declared.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question9() {

    }

    /*
    What is the output of the following code?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class Deer {
    2: public Deer() { System.out.print("Deer"); }
    3: public Deer(int age) { System.out.print("DeerAge"); }
    4: private boolean hasHorns() { return false; }
    5: public static void main(String[] args) {
    6: Deer deer = new Reindeer(5);
    7: System.out.println(","+deer.hasHorns());
    8: }
    9: }
    10: class Reindeer extends Deer {
    11: public Reindeer(int age) { System.out.print("Reindeer"); }
    12: public boolean hasHorns() { return true; }
    13: }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. DeerReindeer,false   - correct
    B. DeerReindeer,true
    C. ReindeerDeer,false
    D. ReindeerDeer,true
    E. DeerAgeReindeer,false
    F. DeerAgeReindeer,true
    G. The code will not compile because of line 7.
    H. The code will not compile because of line 12
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question8() {

    }

    /*
    What is the result of the following code?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    int[] array = {6,9,8};
    List<Integer> list = new ArrayList<>();xxxiv Introduction
    list.add(array[0]);
    list.add(array[2]);
    list.set(1, array[1]);
    list.remove(0);
    System.out.println(list);
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. [8]
    B. [9]  - correct
    C. Something like [Ljava.lang.String;@160bc7c0
    D. An exception is thrown.
    E. The code does not compile.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
    private static void question7() {
        int[] array = {6, 9, 8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        //list.remove(0);
        System.out.println(list);
    }

    /*
    What is the result of the following program?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class MathFunctions {
    2: public static void addToInt(int x, int amountToAdd) {
    3: x = x + amountToAdd;
    4: }
    5: public static void main(String[] args) {
    6: int a = 15;
    7: int b = 10;
    8: MathFunctions.addToInt(a, b);
    9: System.out.println(a); } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. 10
    B. 15       - correct
    C. 25
    D. Compiler error on line 3.
    E. Compiler error on line 8.
    F. None of the above.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question6() {

    }

    /*
    What is the output of the following code snippet?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    13: System.out.print("a");
    14: try {
    15: System.out.print("b");
    16: throw new IllegalArgumentException();
    17: } catch (RuntimeException e) {
    18: System.out.print("c");
    19: } finally {
    20: System.out.print("d");
    21: }
    22: System.out.print("e");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. abe
    B. abce
    C. abde
    D. abcde    - correct
    E. The code does not compile.
    F. An uncaught exception is thrown.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */
    private static void question5() {

        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e) {
            System.out.print("c");
        } finally {
            System.out.print("d");
        }
        System.out.print("e");

    }

    /*
    What is the output of the following program?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: public class FeedingSchedule {
    2: public static void main(String[] args) {
    3: boolean keepGoing = true;
    4: int count = 0;
    5: int x = 3;
    6: while(count++ < 3) {
    7: int y = (1 + 2 * count) % 3;
    8: switch(y) {
    9: default:
    10: case 0: x -= 1; break;
    11: case 1: x += 5;
    12: }
    13: }
    14: System.out.println(x);
    15: } }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. 4
    B. 5
    C. 6    - correct
    D. 7
    E. 13
    F. The code will not compile because of line 7
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
    private static void question4() {

    }

    /*
    What is the output of the following code? (Choose all that apply)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    1: interface HasTail { int getTailLength(); }
    2: abstract class Puma implements HasTail {
    3: protected int getTailLength() {return 4;}
    4: }
    5: public class Cougar extends Puma
    6: public static void main(String[] args) {
    7: Puma puma = new Puma();
    8: System.out.println(puma.getTailLength());
    9: }
    10:
    11: public int getTailLength(int length) {return 2;}
    12: }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. 2
    B. 4
    C. The code will not compile because of line 3.     - correct
    D. The code will not compile because of line 5.     - correct
    E. The code will not compile because of line 7.     - correct
    F. The code will not compile because of line 11.
    G. The output cannot be determined from the code provided.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    В данном примере в классе Puma. Метод в интерфейсе может быть об-
    ъявлен только как public или abstract, а по-умолчанию, в соответ-
    ствии с JSL модификаторы доступа методов интерфейса являются  из-
    быточными с точки зрения стиля. Поэтому объявление метода в  абс-
    трактном классе Puma с модификатором доступа protected вызывает
    ошибку компилятора в строке 3

    Также невозможно создавать экземплят абстрактного класса, поэтому
    в строке 7 тоже будет ошибка компиляции.
     */
    private static void question3() {

    }

    /*
     What is the result of the following class? (Choose all that apply)
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     1: public class _C {
     2: private static int $;
     3: public static void main(String[] main) {
     4: String a_b;
     5: System.out.print($);
     6: System.out.print(a_b);
     7: } }
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     A. Compiler error on line 1.
     B. Compiler error on line 2.
     C. Compiler error on line 4.
     D. Compiler error on line 5.
     E. Compiler error on line 6. - correct
     F. 0null
     G. nullnull
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     Статические переменые, получается, инициализируются значением  по-
     умолчанию, а локальные переменные не могут быть не инициализирова-
     ны.
     */
    private static void question1() {

    }

    /* What is the result of the following code?
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    A. true is printed out exactly once.
    B. true is printed out exactly twice.
    C. true is printed out exactly three times.     - correct
    D. true is printed out exactly four times.
    E. The code does not compile.
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    При создании переменной с помощью sb1.toString()
    происходит создание нового объекта, значение ко-
    торого отличается от значения примитивных типов.
    Все значения типа String хранятся в StringPool-е
    Так, s1 и s2 имеют значение вида {char[4]@477},
    а sb1.toString() имеет значение {char[4]{479}}

    Кроме того, в значении sb1 до вызова метода
    toString() текст хранится в переменной  с фикси-
    рованной длиной [16], а при преобразовании к ну-
    жному формату происходит "отрезка" лишнего.
    */
    private static void question2() {

        String s1 = "Java";
        String s2 = "Java";

        String s3 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }

}