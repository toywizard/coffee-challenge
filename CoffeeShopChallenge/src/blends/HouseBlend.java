package blends;

public class HouseBlend implements Blend {
    private final String description;

    public HouseBlend(){
        this.description = "House Blend";
    }

    @Override
    public String getDescription() {
        return ", " + description;
    }

    @Override
    public double total(){
        return 1.0;
    }
}
