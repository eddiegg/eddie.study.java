package eddie.study.java.patterns.Adapter2;

/**
 * Created by user on 2017/3/16.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Adapter2 Pattern");
        p.printStrong();
    }
}
