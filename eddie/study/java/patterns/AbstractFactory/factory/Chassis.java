package eddie.study.java.patterns.AbstractFactory.factory;

import java.util.ArrayList;

/**
 * Created by eddie on 2017/3/22.
 */
public abstract class Chassis extends Item {
    protected ArrayList chassis = new ArrayList();

    public Chassis(String model) {
        super(model);
    }

    public void add(Item item){
        chassis.add(item);
    }
}
