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

    public static synchronized TicketMaker getTicket(){
        return tickets;
    }
}
