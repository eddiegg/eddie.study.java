package eddie.study.java.patterns.Singleton;

/**
 * Created by eddie on 2017/3/19.
 */
public class TicketMaker {
    private static TicketMaker tickets = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker() {

    }
    public int getNextTicketNumber(){
        return ticket++;
    }
    /**
     * synchronized确保线程安全从而保证是真正的singleton类
     */

    public static synchronized TicketMaker getTicket(){
        return tickets;
    }
}
