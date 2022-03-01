package size;

public class Standard implements Size {

    @Override
    public String getDescription() {
        return "Standard Size";
    }

    @Override
    public double getModifier() {
        return 1.0;
    }
}
