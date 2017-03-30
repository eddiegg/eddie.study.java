package eddie.study.java.patterns.Strategy;

/**
 * Created by user on 2017/3/29.
 */
public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
