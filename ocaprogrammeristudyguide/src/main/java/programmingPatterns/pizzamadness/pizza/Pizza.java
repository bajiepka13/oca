package programmingPatterns.pizzamadness.pizza;

import programmingPatterns.pizzamadness.ingredients.*;

import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake(){
        System.out.println("Готовить на слабом огне в течении 25 минут.");
    }

    void cut(){
        System.out.println("Разрезаем пиццу на слайсы по диагонали.");
    }

    void box(){
        System.out.println("Упаковка пиццы в фирменную картонную коробку.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пицца " + name + " (" +
                dough != null ? dough.toString() + ", " : "" +
                sauce != null ? sauce.toString() + ", " : "" +
                Arrays.toString(veggies) + ", " +
                cheese != null ? cheese.toString() + ", " : "" +
                pepperoni != null ? pepperoni.toString() + ", " : "" +
                clams != null ? clams.toString() : "";
    }
}
