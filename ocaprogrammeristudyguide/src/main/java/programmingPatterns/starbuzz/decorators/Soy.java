package programmingPatterns.starbuzz.decorators;

import programmingPatterns.starbuzz.Beverage;
import programmingPatterns.starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " c добавкой соевого масла";
    }

    @Override
    public double cost() {
        return beverage.cost() + 15.10;
    }
}
