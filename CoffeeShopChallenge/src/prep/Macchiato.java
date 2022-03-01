package prep;

public class Macchiato implements Preparation {
    private final String description;

    public Macchiato() {
        this.description = "Macchiato";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getTotal() {
        return 1.75;
    }
}
