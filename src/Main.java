import gui.GameFrame;
import notgui.Player;

public class Main {
    public static void main(String[] Args){
        generateUI();
//        Player player = new Player("Rares Damian", 1000);
    }
    public static void generateUI() {
        GameFrame gameFrame = new GameFrame();
        gameFrame.setMainPaneUI(new Player("Mitica Telaviv", 1000).getAccount());
        gameFrame.makePublic();

    }
}
