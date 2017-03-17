package eddie.study.java.patterns.TemplateMethod;

/**
 * Created by eddie on 2017/3/17.
 */
public abstract class PlayGame {

    protected abstract void openGameMachine();    //模板方法模式中，迫使子类实现的抽象方法应该声明为protected abstract
    protected abstract void startGame();
    protected abstract void getGameScore();

    public final void letsHaveFun(){               //注意final，定义了流程并且不允许被改变
        openGameMachine();
        startGame();
        getGameScore();
        System.out.println("What a happy afternoon!");
    }
}
