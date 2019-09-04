package programmingPatterns.pizzamadness;

import programmingPatterns.pizzamadness.pizza.NYPizzaStore;
import programmingPatterns.pizzamadness.pizza.Pizza;

public class PizzaMadnessApplication {

    public static void main(String[] args) {

        Pizza cheese = new NYPizzaStore().createPizza("cheese");
        System.out.println(cheese.toString());
    }
}
