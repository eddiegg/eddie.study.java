package eddie.study.java.patterns.Strategy;

import java.util.Random;

/**
 * Created by user on 2017/3/29.
 */
public class WinStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
