package programmingPatterns.adapers;

public class FlyWalker extends AbstractTraveller implements Flyable, Walkable {

    public FlyWalker(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.name);
        return sb.toString();
    }
}
