package eddie.study.java.patterns.TemplateMethod;

/**
 * Created by eddie on 2017/3/17.
 */
public class test {
    public static void main(String[] args) {
        PlayGame father = new FatherGame("The Glory of King", "Mobile");
        PlayGame child = new ChildGame("Talking Tom", "iPad");
        father.letsHaveFun();
        child.letsHaveFun();
    }
}
