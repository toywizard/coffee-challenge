import addition.CocoPowder;
import addition.Milk;
import addition.Sugar;
import blends.Arabica;
import blends.DarkRoast;
import blends.Robusta;
import prep.Cappuccino;
import prep.Macchiato;
import prep.Mocha;
import size.Addict;
import size.Large;
import size.Standard;

import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {

    @org.junit.jupiter.api.Test
    void getDescription() {
        Drink drink = new Drink();
        drink.setBlend(new Arabica());
        drink.setPrep(new Cappuccino());
        drink.setSize(new Standard());
        drink.addAddition(new Milk());
        drink.addAddition(new Sugar());
        System.out.println(drink.getDescription());
        assertEquals("Standard Size, Arabica, Cappuccino, Milk, Sugar",drink.getDescription());

        drink = new Drink();
        System.out.println(drink.getDescription());
        drink.setBlend(new Robusta());
        drink.setPrep(new Macchiato());
        drink.setSize(new Large());
        drink.addAddition(new Milk());
        System.out.println(drink.getDescription());
        assertEquals("Large Size, Robusta, Macchiato, Milk",drink.getDescription());

        drink = new Drink();
        System.out.println(drink.getDescription());
        drink.setBlend(new DarkRoast());
        drink.setPrep(new Mocha());
        drink.setSize(new Addict());
        drink.addAddition(new Milk());
        drink.addAddition(new CocoPowder());
        assertEquals("Addict Size, Dark Roast, Mocha, Milk, Coco Powder",drink.getDescription());
    }

    @org.junit.jupiter.api.Test
    void getTotal() {
        Drink drink = new Drink();
        drink.setBlend(new Arabica());
        drink.setPrep(new Cappuccino());
        drink.setSize(new Standard());
        drink.addAddition(new Milk());
        drink.addAddition(new Sugar());

        double test = (2.5+1.5)* 1.0 + 1.0 + 0.25;
        assertEquals(test,drink.getTotal());

        drink = new Drink();
        drink.setBlend(new Robusta());
        drink.setPrep(new Macchiato());
        drink.setSize(new Large());
        drink.addAddition(new Milk());

        test = (2.0 + 1.75)* 1.5 + 1.0;
        assertEquals(test,drink.getTotal());

        drink = new Drink();
        drink.setBlend(new DarkRoast());
        drink.setPrep(new Mocha());
        drink.setSize(new Addict());
        drink.addAddition(new Milk());
        drink.addAddition(new CocoPowder());

        test = (1.5 + 2.0)* 2 + 1.0 + 0.1;
        assertEquals(test,drink.getTotal());
    }
}