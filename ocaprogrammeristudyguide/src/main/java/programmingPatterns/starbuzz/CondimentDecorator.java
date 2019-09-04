package programmingPatterns.starbuzz;

public class CondimentDecorator extends Beverage {

    @Override
    public String getDescription() {
        return "Декоратор напитков";
    }

    @Override
    public double cost() {
        return 0;
    }
}
