package programmingPatterns.adapers;

public class Walker extends AbstractTraveller implements Walkable {

    public Walker(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Walker{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
