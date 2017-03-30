package eddie.study.java.Basic;

/**
 * Created by eddie on 2017/3/30.
 */
public class CalTime {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        long startTime2 = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long estTime = System.nanoTime() - startTime;
        long estTime2 = System.currentTimeMillis() - startTime2;
        System.out.println(estTime);
        System.out.println(estTime2);
    }
}
