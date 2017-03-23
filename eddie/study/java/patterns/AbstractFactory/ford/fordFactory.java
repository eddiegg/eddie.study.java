package eddie.study.java.patterns.AbstractFactory.ford;

import eddie.study.java.patterns.AbstractFactory.factory.Chassis;
import eddie.study.java.patterns.AbstractFactory.factory.Engine;
import eddie.study.java.patterns.AbstractFactory.factory.Factory;
import eddie.study.java.patterns.AbstractFactory.factory.Vehicle;

/**
 * Created by eddie on 2017/3/23.
 */
public class fordFactory extends Factory {
    @Override
    public Engine createEngine(String model, String sweptVolume) {
        return new fordEngine(model, sweptVolume);
    }

    @Override
    public Chassis createChassis(String model) {
        return new fordChassis(model);
    }

    @Override
    public Vehicle createVehicle(String brand) {
        return new fordRacingCar(brand);
    }
}
