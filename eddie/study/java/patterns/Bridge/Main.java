package eddie.study.java.patterns.Bridge;

/**
 * Created by user on 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
//        Display dis = new Display(new StringDisplayImpl("Eddie"));
//        Display dis2 = new CountDisplay(new StringDisplayImpl("Harvey"));
//        new CountDisplay(new StringDisplayImpl("Harvey")).multipleDisplay(5);
        Display dis3 = new Display(new RandomDisplay("eddie"));
        dis3.display();
    }
}
