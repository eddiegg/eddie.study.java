package eddie.study.java.patterns.Bridge;

/**
 * Created by user on 2017/3/28.
 */
public class Display {
    private DisplayImlp imp;

    public Display(DisplayImlp imp) {
        this.imp = imp;
    }

    public void open(){
        imp.rawOpen();
    }

    public void print(){
        imp.rawPrint();
    }

    public void close(){
        imp.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }
}
