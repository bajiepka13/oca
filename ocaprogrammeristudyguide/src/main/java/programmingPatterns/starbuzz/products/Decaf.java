package programmingPatterns.starbuzz.products;

import programmingPatterns.starbuzz.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Без кофеина";
    }

    @Override
    public double cost() {
        return 65.25;
    }
}
