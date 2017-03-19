package eddie.study.java.patterns.FactoryMethod.toy;

import eddie.study.java.patterns.FactoryMethod.framework.Factory;
import eddie.study.java.patterns.FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eddie on 2017/3/19.
 */
public class IDCardFactory extends Factory{
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
