package eddie.study.java.patterns.AbstractFactory.factory;

/**
 * Created by eddie on 2017/3/22.
 */
public abstract class Item {
    protected String model;

    public Item(String model) {
        this.model = model;
    }

    public abstract String makeItem();
}
