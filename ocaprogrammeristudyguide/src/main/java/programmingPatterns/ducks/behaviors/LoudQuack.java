package programmingPatterns.ducks.behaviors;

import programmingPatterns.ducks.behaviors.QuackBehavior;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("КРЯ-КРЯ!");
    }
}
