package programmingPatterns.ducks;

import programmingPatterns.ducks.behaviors.FlyWithWings;
import programmingPatterns.ducks.behaviors.SilentQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new SilentQuack();
        this.flyBehavior = new FlyWithWings();
    }


    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }
}
