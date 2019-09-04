package programmingPatterns.starbuzz.products;

import programmingPatterns.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Тёмная обжарка";
    }

    @Override
    public double cost() {
        return 80.30;
    }
}
