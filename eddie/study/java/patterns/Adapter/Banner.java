package eddie.study.java.patterns.Adapter;

/**
 * Created by user on 2017/3/16.
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("("+string+")");
    }
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
