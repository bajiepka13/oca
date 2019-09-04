package programmingPatterns;

import programmingPatterns.ducks.Duck;
import programmingPatterns.ducks.ModelDuck;
import programmingPatterns.ducks.behaviors.FlyWithWings;

public class DuckApplication {

    public static void main(String[] args) {

        Duck mallard = new ModelDuck();
        mallard.display();

        mallard.setFlyBehavior(new FlyWithWings());
        mallard.performFly();
        mallard.performQuack();

    }
}
