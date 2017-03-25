package tagver3;

/**
 *
 * @author Zack
 */
public class TextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GameController g = new GameController();
        Boundery b = new Boundery();

        b.askNamed();
        b.intro();
        g.runGame();

    }

}
