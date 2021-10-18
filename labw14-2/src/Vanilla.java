/**
 * Name: Alice Li
 * Project: Decorator Lab
 * Date: 21 February 2020
 */

public class Vanilla extends IceCream {

    public static final double COST = 1.25;

    public Vanilla() {
        description = "smooth vanilla";
    }

    public double cost() {
        return COST;
    }

}
