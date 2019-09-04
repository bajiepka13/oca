package programmingPatterns.starbuzz.products;

import programmingPatterns.starbuzz.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Кофе Эспрессо";
    }

    @Override
    public double cost() {
        return 125.50;
    }
}
