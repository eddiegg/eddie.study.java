package eddie.study.java.patterns.Bridge;

import java.util.Random;

/**
 * Created by user on 2017/3/28.
 */
public class RandomDisplay extends DisplayImlp {
    private String string;
    Random r = new Random();
    int times = r.nextInt(9);

    public RandomDisplay(String string) {
        this.string = string;
    }

    @Override
    public void rawOpen() {

    }

    @Override
    public void rawPrint() {
        randomDisplay(times);
    }

    @Override
    public void rawClose() {

    }

    public void randomDisplay(int times){
        for (int i = 0; i < times; i++) {
            System.out.println(string);
        }
    }
}
