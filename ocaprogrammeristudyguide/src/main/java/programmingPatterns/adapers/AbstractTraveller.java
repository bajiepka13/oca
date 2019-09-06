package programmingPatterns.adapers;

public abstract class AbstractTraveller {

    protected String name;

    public AbstractTraveller(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AbstractTraveller{" +
                "name='" + name + '\'' +
                '}';
    }
}
