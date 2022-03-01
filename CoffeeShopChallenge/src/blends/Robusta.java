package blends;

public class Robusta implements Blend {
    private final String description;

    public Robusta(){
        this.description = "Robusta";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double total() {
        return 2.00;
    }
}
