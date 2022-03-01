package size;

public class Addict implements Size {
    @Override
    public String getDescription() {
        return "Addict Size";
    }

    @Override
    public double getModifier() {
        return 2.0;
    }
}
