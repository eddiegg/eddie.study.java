package eddie.study.java.patterns.Singleton;

/**
 * Created by eddie on 2017/3/19.
 */
public class main {
    public static void main(String[] args) {
        TicketMaker ticket = TicketMaker.getTicket();
        for (int i = 0; i < 10; i++) {
            System.out.println(ticket.getNextTicketNumber());
        }
    }
}
