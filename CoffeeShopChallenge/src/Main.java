import addition.*;
import blends.*;
import prep.*;
import size.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Please Enter type");
            String input = scan.next();
            if ("H".equals(input)) {
                drink.setBlend(new HouseBlend());
                break;
            } else if ("D".equals(input)) {
                drink.setBlend(new DarkRoast());
                break;
            } else if ("R".equals(input)) {
                drink.setBlend(new Robusta());
                break;
            } else if ("A".equals(input)) {
                drink.setBlend(new Arabica());
                break;
            } else System.out.println("type not found");
        }

        while (true) {
            System.out.println("How will it be prepared?");
            String input = scan.next();
            if ("E".equals(input)) {
                drink.setPrep(new Expresso());
                break;
            } else if ("L".equals(input)) {
                drink.setPrep(new Latte());
                break;
            } else if ("C".equals(input)) {
                drink.setPrep(new Cappuccino());
                break;
            } else if ("MA".equals(input)) {
                drink.setPrep(new Macchiato());
                break;
            } else if ("MO".equals(input)) {
                drink.setPrep(new Mocha());
                break;
            } else System.out.println("type not found");
        }

        while (true) {
            System.out.println("What size?");
            String input = scan.next();
            if ("S".equals(input)) {
                drink.setSize(new Standard());
                break;
            } else if ("C".equals(input)) {
                drink.setSize(new Child());
                break;
            } else if ("L".equals(input)) {
                drink.setSize(new Large());
                break;
            } else if ("A".equals(input)) {
                drink.setSize(new Addict());
                break;
            }
        }

        System.out.println("Any additions?");
        while (true) {

            String input = scan.next();
            if ("M".equals(input)) {
                drink.addAddition(new Milk());
            } else if ("S".equals(input)) {
                drink.addAddition(new Sugar());
            } else if ("C".equals(input)) {
                drink.addAddition(new CocoPowder());
            } else if ("X".equals(input) || "N".equals(input)) {
                break;
            }
            System.out.println("More additions?");
        }

        System.out.println("You ordered: \n" + drink.getDescription() + "\nTotal: $" + drink.getTotal());
    }
}
