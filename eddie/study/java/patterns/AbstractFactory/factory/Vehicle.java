package eddie.study.java.patterns.AbstractFactory.factory;

import java.util.ArrayList;

/**
 * Created by eddie on 2017/3/22.
 */
public abstract class Vehicle {
    protected String brand;
    protected ArrayList parts = new ArrayList();

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void add(Item item) {
        parts.add(item);
    }

    public void sell() {
        build();
        System.out.println("All parts are built together, ready for sell");

    }

    public abstract String build();
}
