package eddie.study.java.patterns.AbstractFactory.ford;

import eddie.study.java.patterns.AbstractFactory.factory.Engine;

/**
 * Created by eddie on 2017/3/23.
 */
public class fordEngine extends Engine {
    public fordEngine(String model, String sweptVolume) {
        super(model, sweptVolume);
    }

    @Override
    public String makeItem() {
        return model+sweptVolume+" engine is ready!";
    }
}

