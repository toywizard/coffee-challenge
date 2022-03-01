package addition;

public class Milk implements Addition{
    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double total() {
        return 1.0;
    }
}
