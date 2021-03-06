package eddie.study.java.patterns.FactoryMethod.framework;

/**
 * Created by eddie on 2017/3/18.
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
