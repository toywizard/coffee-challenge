package prep;

public class Latte implements Preparation {
    private final String description;

    public Latte() {
        this.description = "Latte";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getTotal() {
        return 1.25;
    }
}
