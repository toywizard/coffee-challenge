import addition.Addition;
import blends.Blend;
import prep.Preparation;
import size.Size;

import java.util.ArrayList;

public class Drink {
    private Blend blend; // coffee blend or type
    private Preparation prep; // preparation method
    private Size size; // cup size
    private final ArrayList<Addition> additions = new ArrayList(); // list of condiments

    public Blend getBlend() {
        return blend;
    }

    public void setBlend(Blend blend) {
        this.blend = blend;
    }

    public Preparation getPrep() {
        return prep;
    }

    public void setPrep(Preparation prep) {
        this.prep = prep;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void addAddition(Addition ad) {
        additions.add(ad);
    }

    public String getDescription() {
        String description = "";

        if(size != null && blend != null && prep != null) {

            description = size.getDescription() + ", " + blend.getDescription() + ", " + prep.getDescription();
            for (Addition ad : additions) {
                description += ", " + ad.getDescription();
            }

        }

        return description;
    }

    public double getTotal() {
        double total = 0.0;

        if(size != null && blend != null && prep != null) {
            total = blend.total() + prep.getTotal();
            total *= size.getModifier();

            for (Addition ad : additions) {
                total += ad.total();
            }

        }
        return total;
    }
}
