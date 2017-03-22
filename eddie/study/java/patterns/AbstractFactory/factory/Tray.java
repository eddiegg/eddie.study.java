package eddie.study.java.patterns.AbstractFactory.factory;

import java.util.ArrayList;

/**
 * Created by eddie on 2017/3/22.
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption, ArrayList tray) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
