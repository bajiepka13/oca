package Introduction.introduction_review.QUESTION7.employee;

//import Introduction.introduction_review.QUESTION7.aquarium.*;
//import Introduction.introduction_review.QUESTION7.aquarium.jellies.Water;

public class WaterFilter {

    static boolean b;
    static int i;

    public static void main(String names[]) {

        Bear bear = new Bear();
        bear = null;
        System.gc();

        int i1 = 1_234;
//        double d1 = 1_234_.0;
//        double d1 = 1_234._0;
        double d1 = 1_234.0;


//        int amount = 9L;
        int amount = 0b101;
        int amount2 = 0xE;
        double amount3 = 0xE;
//        double amount4 = 1_2_.0_0;
//        int amount5 = 1_2_;

        System.out.println(b);
        System.out.println(i);

    }
}

class AnotherClass {

}

class Bear {
    protected void finalize() {
        System.out.println("Roar!");
    }
}
