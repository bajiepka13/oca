package Introduction.introduction_review.question21;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Salmon {

    int count;

    public void Salmon() {
        count = 4;
    }

    public static void main(String[] args) {

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                .SHORT);
        System.out.println(f.format(d));

    }
}

class CompareValues {

    public static void main(String[] args) {

        int x = 0;
        while (x++ < 10) {
        }
        String message = x > 10 ? "Greater than" : "false";
        System.out.println(message + "," + x);

    }
}

class QuestionFour {
    public static void main(String[] args) {

        long x = 10;
        int y = (int) (2 * x);

    }
}

class Fish {
    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
//        String anotherFish = numFish + 1;
//        System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);
    }
}

class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }

    public static void main(String[] args) {
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }
}

class OverloadedMethodOrder{

    public static void main(String[] args) {

        int i = 10;
        OverloadedMethodOrder o = new OverloadedMethodOrder();
        System.out.println(o.glide((short) i));

    }

    public String glide(int i){
        return "int";
    }

    public String glide(long i){
        return "long";
    }

    public String glide(Integer i){
        return "Integer";
    }

}