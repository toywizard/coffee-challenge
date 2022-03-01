package prep;

public class Expresso implements Preparation {
    private final String description;

    public Expresso(){
        this.description = "Expresso";
    }

    public String getDescription(){
        return description;
    }

    @Override
    public double getTotal() {
        return 1.0;
    }
}
