package eddie.study.java.patterns.Strategy;

/**
 * Created by eddie on 2017/3/29.
 */
public class Hand {
    public static final int HANDVALUE_ROCK = 0;
    public static final int HANDVALUE_SCISSORS = 1;
    public static final int HANDVALUE_PAPER = 2;

    private int handValue;

    private static final String[] name = {"石头","剪刀","布"};

    public static final Hand[] hand = {
            new Hand(HANDVALUE_ROCK),
            new Hand(HANDVALUE_SCISSORS),
            new Hand(HANDVALUE_PAPER)
    };

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString(){
        return name[handValue];
    }

}
