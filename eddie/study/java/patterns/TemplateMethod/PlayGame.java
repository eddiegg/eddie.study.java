package eddie.study.java.patterns.TemplateMethod;

/**
 * Created by eddie on 2017/3/17.
 * Java 8的接口可以有default和static实现（和抽象相反）方法，大部分情况下可以替代抽象类
 */
public abstract class PlayGame {
    public abstract void openGameMachine();
    public abstract void startGame();
    public abstract void getGameScore();

    public final void letsHaveFun(){
        openGameMachine();
        startGame();
        getGameScore();
        System.out.println("What a happy afternoon!");
    }
}
