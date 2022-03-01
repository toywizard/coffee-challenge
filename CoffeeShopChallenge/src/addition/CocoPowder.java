package addition;

public class CocoPowder implements Addition{
    @Override
    public String getDescription() {
        return "Coco Powder";
    }

    @Override
    public double total() {
        return 0.1;
    }
}
