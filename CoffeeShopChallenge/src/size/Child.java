package size;

public class Child implements Size {
    @Override
    public String getDescription() {
        return "Child Size, ";
    }

    @Override
    public double getModifier() {
        return 0.75;
    }
}
