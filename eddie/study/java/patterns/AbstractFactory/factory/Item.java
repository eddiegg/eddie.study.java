package eddie.study.java.patterns.AbstractFactory.factory;

/**
 * Created by eddie on 2017/3/22.
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
