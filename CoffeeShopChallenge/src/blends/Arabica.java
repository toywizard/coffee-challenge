package blends;

public class Arabica implements Blend {
    public String description;

    public Arabica() {
        this.description = "Arabica";
    }

    public String getDescription() {
        return description;
    }


    public double total() {
        return 2.5;
    }
}
