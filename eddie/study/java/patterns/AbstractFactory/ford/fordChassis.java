package eddie.study.java.patterns.AbstractFactory.ford;

import eddie.study.java.patterns.AbstractFactory.factory.Chassis;
import eddie.study.java.patterns.AbstractFactory.factory.Engine;
import eddie.study.java.patterns.AbstractFactory.factory.Factory;
import eddie.study.java.patterns.AbstractFactory.factory.Vehicle;

/**
 * Created by eddie on 2017/3/23.
 */
public class fordChassis extends Chassis {
    @Override
    public String makeItem() {
        return model+" chassis is ready!";
    }

    public fordChassis(String model) {
        super(model);
    }

}
