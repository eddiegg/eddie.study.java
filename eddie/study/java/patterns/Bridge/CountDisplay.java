package eddie.study.java.patterns.Bridge;

/**
 * Created by user on 2017/3/28.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImlp imp) {
        super(imp);
    }
    public void multipleDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
