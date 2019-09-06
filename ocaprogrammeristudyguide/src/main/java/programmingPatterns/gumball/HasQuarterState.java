package programmingPatterns.gumball;

public class HasQuarterState implements State {

    GumBallMachine machine;

    public HasQuarterState(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы уже кинули четвертак.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Возвращаем четвертак.");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули ручку...");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Нет жевачки для выдачи.");
    }
}
