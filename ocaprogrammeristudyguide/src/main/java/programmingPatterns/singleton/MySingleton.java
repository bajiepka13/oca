package programmingPatterns.singleton;

public class MySingleton {

    private volatile static MySingleton instance = null;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class){
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
