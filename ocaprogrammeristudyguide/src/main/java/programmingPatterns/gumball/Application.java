package programmingPatterns.gumball;

public class Application {

    public static void main(String[] args) {

        GumBallMachine machine = new GumBallMachine(100);
        machine.insertQuarter();
        machine.turnCrank();
        machine.releaseGumBall();

        System.out.println(machine.getGumballs());

    }
}
