package programmingPatterns.ducks.behaviors;

import programmingPatterns.ducks.behaviors.QuackBehavior;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кря...");
    }
}
