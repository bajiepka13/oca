package programmingPatterns.starbuzz;

import programmingPatterns.starbuzz.decorators.Mocha;
import programmingPatterns.starbuzz.decorators.Soy;
import programmingPatterns.starbuzz.products.Espresso;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage espresso = new Soy(new Mocha(new Espresso()));
        p(espresso.getDescription(), espresso.cost());

    }

    private static void p(String description, double cost){
        System.out.println(
                String.format("Вы заказали кофе: %s, стоимость: %f руб.",
                        description,
                        Double.valueOf(cost)));
    }
}
