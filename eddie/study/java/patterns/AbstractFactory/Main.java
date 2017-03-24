package eddie.study.java.patterns.AbstractFactory;

import eddie.study.java.patterns.AbstractFactory.factory.Chassis;
import eddie.study.java.patterns.AbstractFactory.factory.Engine;
import eddie.study.java.patterns.AbstractFactory.factory.Factory;
import eddie.study.java.patterns.AbstractFactory.factory.Vehicle;


/**
 * Created by eddie on 2017/3/23.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("eddie.study.java.patterns.AbstractFactory.ford.fordFactory");
        Engine TC12 = factory.createEngine("Turbo Charger", "1200ml");
        Chassis racingCar = factory.createChassis("FordSpeed");
        Vehicle fct = factory.createVehicle("Focus ST");
        fct.add(TC12);
        fct.add(racingCar);
        fct.build();
        fct.sell();
    }
}