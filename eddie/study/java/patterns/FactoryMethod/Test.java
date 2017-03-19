package eddie.study.java.patterns.FactoryMethod;

import eddie.study.java.patterns.FactoryMethod.framework.Factory;
import eddie.study.java.patterns.FactoryMethod.framework.Product;
import eddie.study.java.patterns.FactoryMethod.toy.IDCardFactory;

/**
 * Created by eddie on 2017/3/19.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("eddie");
        Product card2 = factory.create("lennie");
        card1.use();
        System.out.println(((IDCardFactory)factory).getOwners());
    }
}
