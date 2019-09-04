package programmingPatterns.starbuzz.products;

import programmingPatterns.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "Домашняя смесь";
    }

    @Override
    public double cost() {
        return 220.90;
    }
}
