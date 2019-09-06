package programmingPatterns.gumball;

public class WinnerStatus implements State {

    GumBallMachine machine;

    public WinnerStatus(GumBallMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Подождите, мы уже готовимся выдавать жевачку.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Вы уже повернули рычаг. Получить обратно монету не получится.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Повернув рычаг дважды ничего не произойдёт.");
    }

    @Override
    public void dispense() {
        machine.releaseGumBall();
        if (machine.getGumballs() > 1) {
            machine.setState(machine.getNoQuarterState());
        }
        else {
            System.out.println("Жевачка закончилась!");
            machine.setState(machine.getSoldOutState());
        }
    }
}
