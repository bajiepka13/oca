package programmingPatterns.pizzamadness;

import programmingPatterns.pizzamadness.ingredients.*;
import programmingPatterns.pizzamadness.ingredients.common.SlicedPepperoni;
import programmingPatterns.pizzamadness.ingredients.common.newyork.*;
import programmingPatterns.pizzamadness.ingredients.vegetables.Garlic;
import programmingPatterns.pizzamadness.ingredients.vegetables.Mushroom;
import programmingPatterns.pizzamadness.ingredients.vegetables.Onion;
import programmingPatterns.pizzamadness.ingredients.vegetables.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}
