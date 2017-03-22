package eddie.study.java.patterns.Builder;

/**
 * Created by user on 2017/3/22.
 */
public class Main {
    public static void main(String[] args) {
        MyHouse house = new MyHouse();
        Director di = new Director(house);
        di.cons();
    }
}
