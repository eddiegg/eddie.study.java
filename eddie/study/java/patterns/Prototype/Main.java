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
        msgbox.i = 99;
        System.out.println(((MessageBox) p).i);  //100 基本数据类型会clone
        System.out.println(msgbox.i);  //99
        msgbox.st.add("eddie");
        System.out.println(msgbox.st);  //abc,eddie
        System.out.println(((MessageBox) p).st);  //abc,eddie 其他类型传递引用
    }
}
