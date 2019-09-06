package programmingPatterns.gumball;

public class NoQuarterState implements State {

    GumBallMachine machine;

    public NoQuarterState(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Вы бросили четвертак в автомат.");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы ничего не бросали в автомат.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Вы повернули ручку, но ничего не происходит - нет четвертака.");
    }

    @Override
    public void dispense() {
        System.out.println("Сначала нужно забросить четвертак в автомат");
    }
}
