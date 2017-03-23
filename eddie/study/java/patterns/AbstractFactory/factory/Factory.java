package eddie.study.java.patterns.AbstractFactory.factory;

/**
 * Created by eddie on 2017/3/23.
 */
public abstract class Factory {
    public static Factory getFactory(String classname){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到"+classname+"类。");
        }
        return factory;
    }

    public abstract Engine createEngine(String model, String sweptVolume);
    public abstract Chassis createChassis(String model);
    public abstract Vehicle createVehicle(String brand);
}
