package eddie.study.java.patterns.Adapter;

/**
 * Created by user on 2017/3/16.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Adapter Pattern");
        p.printStrong();
        p.printWeak();
    }
}
