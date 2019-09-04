package programmingPatterns.pizzamadness.pizza;

import programmingPatterns.pizzamadness.NYPizzaIngredientFactory;
import programmingPatterns.pizzamadness.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    public Pizza orderPizza(String item){

        Pizza pizza = makePizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    private Pizza makePizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item){
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Ney York Style Cheese Pizza");
                break;

            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Ney York Style Vegetarian Pizza");
                break;

            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Ney York Style Clam Pizza");
                break;

            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Ney York Style Cheese Pizza");
        }
        return pizza;
    }
}
