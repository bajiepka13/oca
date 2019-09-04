package programmingPatterns.starbuzz;

public abstract class Beverage {

    String description = "Абстрактный напиток...";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
