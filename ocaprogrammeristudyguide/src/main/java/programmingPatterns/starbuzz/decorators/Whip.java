package programmingPatterns.starbuzz.decorators;

import programmingPatterns.starbuzz.Beverage;
import programmingPatterns.starbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " с казинаками";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20.50;
    }
}
