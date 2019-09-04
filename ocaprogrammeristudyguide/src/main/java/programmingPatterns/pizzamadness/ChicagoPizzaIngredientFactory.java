package programmingPatterns.pizzamadness;

import programmingPatterns.pizzamadness.ingredients.*;
import programmingPatterns.pizzamadness.ingredients.common.SlicedPepperoni;
import programmingPatterns.pizzamadness.ingredients.common.chicago.FrozenClams;
import programmingPatterns.pizzamadness.ingredients.common.chicago.Mozarella;
import programmingPatterns.pizzamadness.ingredients.common.chicago.PlumTomatoSauce;
import programmingPatterns.pizzamadness.ingredients.common.chicago.ThickCrustDough;
import programmingPatterns.pizzamadness.ingredients.vegetables.BlackOlives;
import programmingPatterns.pizzamadness.ingredients.vegetables.EggPlant;
import programmingPatterns.pizzamadness.ingredients.vegetables.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Spinach(),
                new EggPlant(),
                new BlackOlives()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
