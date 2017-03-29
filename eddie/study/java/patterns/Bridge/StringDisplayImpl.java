package eddie.study.java.patterns.Bridge;

/**
 * Created by user on 2017/3/28.
 */
public class StringDisplayImpl extends DisplayImlp {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
