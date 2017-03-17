package eddie.study.java.patterns.TemplateMethod;

/**
 * Created by eddie on 2017/3/17.
 */
public abstract class PlayGame {
    public abstract void openGameMachine();
    public abstract void startGame();
    public abstract void getGameScore();
    public void letsHaveFun(){
        openGameMachine();
        startGame();
        getGameScore();
        System.out.println("What a happy afternoon!");
    }


}
