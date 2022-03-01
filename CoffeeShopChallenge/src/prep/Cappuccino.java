package prep;

public class Cappuccino implements Preparation  {
    private final String description;

    public Cappuccino() {
        this.description = "Cappuccino";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getTotal() {
        return 1.5;
    }
}
