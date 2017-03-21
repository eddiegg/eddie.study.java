package eddie.study.java.patterns.Prototype;

import eddie.study.java.patterns.Prototype.framework.Product;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by eddie on 2017/3/20.
 */
public class MessageBox implements Product {
    private String decochar;
    public int i = 100;
    public ArrayList<String> st = new ArrayList<String>(Arrays.asList("abc"));

    public MessageBox(String decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.length();
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
