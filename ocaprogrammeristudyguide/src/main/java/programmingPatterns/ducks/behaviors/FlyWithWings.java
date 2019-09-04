package programmingPatterns.ducks.behaviors;

import programmingPatterns.ducks.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Утка летит!");
    }
}
