package eddie.study.java.patterns.TemplateMethod;


/**
 * Created by user on 2017/3/17.
 */
public class FatherGame extends PlayGame {
    private String game;
    private String gameMachine;

    public FatherGame(String game, String gameMachine) {
        this.game = game;
        this.gameMachine = gameMachine;
    }

    @Override
    public void openGameMachine() {
        System.out.println("Open "+ gameMachine);
    }

    @Override
    public void startGame() {
        System.out.println("Play "+game + " online");
    }

    @Override
    public void getGameScore() {
        System.out.println("Genius you get " + (int)(Math.random()*100));
    }

}
