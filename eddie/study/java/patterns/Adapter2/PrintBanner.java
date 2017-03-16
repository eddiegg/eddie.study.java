package eddie.study.java.patterns.Adapter2;

/**
 * Created by user on 2017/3/16.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
