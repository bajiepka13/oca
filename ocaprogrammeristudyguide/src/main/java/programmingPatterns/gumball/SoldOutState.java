package programmingPatterns.gumball;

public class SoldOutState implements State {

    GumBallMachine machine;

    public SoldOutState(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Нету жевачки в автомате!");
        ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Получите обратно четвертак.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Автомат пуст, поворот рычага ничего не меняет");
    }

    @Override
    public void dispense() {
        System.out.println("Автомат пуст, выдавать нечего");
    }
}
