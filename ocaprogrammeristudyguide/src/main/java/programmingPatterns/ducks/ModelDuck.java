package programmingPatterns.ducks;

import programmingPatterns.ducks.behaviors.FlyWithoutWings;
import programmingPatterns.ducks.behaviors.SilentQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyWithoutWings();
        this.quackBehavior = new SilentQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }
}
