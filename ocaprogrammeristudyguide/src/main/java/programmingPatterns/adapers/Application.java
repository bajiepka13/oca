package programmingPatterns.adapers;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Walkable> walkers = Arrays.asList(new Walker("Walker"), new FlyWalker("Flywalker"));
        walkers.stream().forEach(System.out::println);

    }

}
