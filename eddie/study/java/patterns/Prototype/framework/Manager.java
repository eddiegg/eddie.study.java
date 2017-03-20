package eddie.study.java.patterns.Prototype.framework;

import java.util.HashMap;

/**
 * Created by eddie on 2017/3/20.
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }
    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
