package programmingPatterns.singleton;

public class Application {

    public static void main(String[] args) {

        MySingleton singleton = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();
        MySingleton singleton3 = MySingleton.getInstance();

    }
}
