package size;

public class Large implements Size {
    @Override
    public String getDescription() {
        return "Large Size";
    }

    @Override
    public double getModifier() {
        return 1.5;
    }
}
