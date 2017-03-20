package eddie.study.java.patterns.Prototype;

import eddie.study.java.patterns.Prototype.framework.Manager;
import eddie.study.java.patterns.Prototype.framework.Product;

/**
 * Created by eddie on 2017/3/20.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox msgbox = new MessageBox("*");
        manager.register("Strong", msgbox);

        Product p = manager.create("Strong");
        p.use("Hi eddie");
    }
}
