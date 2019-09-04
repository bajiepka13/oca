package programmingPatterns.pizzamadness;

import programmingPatterns.pizzamadness.ingredients.*;

/**
 * Фабрика предназначена для создания ингредиентов пиццы.
 * В каждую пиццу входит основа, соус, сыр, перец, овощи
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
