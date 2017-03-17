package eddie.study.java.patterns.Adapter3;

/**
 * Created by user on 2017/3/17.
 */
public class Test {
    public static void main(String[] args) {
        Print p = new PrintBanner("打印");
        p.printStrong();
        p.printWeak();
    }
}
