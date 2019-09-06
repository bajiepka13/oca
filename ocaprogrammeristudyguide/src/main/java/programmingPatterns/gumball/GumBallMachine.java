package programmingPatterns.gumball;

public class GumBallMachine {

    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldOutState;

    private State state = soldOutState;
    private int gumballs = 0;

    public GumBallMachine(int gumballs) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);

        this.gumballs = gumballs;

        if (gumballs > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseGumBall(){
        System.out.println("Шарик жвачки уже катится к вам");
        if (gumballs != 0){
            gumballs--;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public int getGumballs() {
        return gumballs;
    }
}
