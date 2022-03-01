package blends;

public class DarkRoast implements Blend {
    private final String description;

    public DarkRoast(){
        this.description = "Dark Roast";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double total(){
        return 1.5;
    }
}
