package eddie.study.java.patterns.Adapter3;

/**
 * Created by user on 2017/3/17.
 */
public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
