package eddie.study.java.patterns.AbstractFactory.ford;

import eddie.study.java.patterns.AbstractFactory.factory.Item;
import eddie.study.java.patterns.AbstractFactory.factory.Vehicle;

import java.util.Iterator;

/**
 * Created by eddie on 2017/3/23.
 */
public class fordRacingCar extends Vehicle {
    public fordRacingCar(String brand) {
        super(brand);
    }

    @Override
    public String build() {
        Iterator it = parts.iterator();
        while(it.hasNext()){
            Item item = (Item) it.next();
            System.out.println(item.makeItem());
        }
        return brand+" Racing Car is ready!";
    }
}
