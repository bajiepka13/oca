package programmingPatterns.starbuzz.decorators;

import programmingPatterns.starbuzz.Beverage;
import programmingPatterns.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Мокка";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10.50;
    }
}
