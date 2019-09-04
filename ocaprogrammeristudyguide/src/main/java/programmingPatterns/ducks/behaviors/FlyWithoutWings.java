package programmingPatterns.ducks.behaviors;

import programmingPatterns.ducks.behaviors.FlyBehavior;

public class FlyWithoutWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }
}
