package addition;

public class Sugar implements Addition {
    @Override
    public String getDescription() {
        return "Sugar";
    }

    @Override
    public double total() {
        return 0.25;
    }
}
