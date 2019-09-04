package Introduction.question10;

public class Grasshoper {

    public Grasshoper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Grasshoper one = new Grasshoper("g1");
        Grasshoper two = new Grasshoper("g2");
        one = two;
        two = null;
        one = null;
    }

    private String name;
}
