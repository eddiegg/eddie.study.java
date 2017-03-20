package eddie.study.java.patterns.Prototype.framework;

/**
 * Created by eddie on 2017/3/20.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
