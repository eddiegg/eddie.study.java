package eddie.study.java.patterns.AbstractFactory.factory;

/**
 * Created by user on 2017/3/22.
 */
public abstract class Engine extends Item {
    protected String sweptVolume;

    public Engine(String model, String sweptVolume) {
        super(model);
        this.sweptVolume = sweptVolume;
    }
}
