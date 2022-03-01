package prep;

public class Mocha implements Preparation {
    public String description;

    public Mocha() {
        this.description = "Mocha";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getTotal() {
        return 2.0;
    }
}
