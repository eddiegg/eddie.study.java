package eddie.study.java.patterns.TemplateMethod;


/**
 * Created by user on 2017/3/17.
 */
public class ChildGame extends PlayGame {
    private String game;
    private String gameMachine;
    public ChildGame(String game, String gameMachine) {
        this.game = game;
        this.gameMachine = gameMachine;
    }

    @Override
    public void openGameMachine() {
        System.out.println("Open "+ gameMachine +" with the help of farther");
    }

    @Override
    public void startGame() {
        System.out.println("Let's play "+game + " with father");
    }

    @Override
    public void getGameScore() {
        System.out.println("You get " + (int)(Math.random()*100));
    }

}
