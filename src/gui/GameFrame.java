package gui;


import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    private final Container mainPane;
    public GameFrame() {
        super();
        this.mainPane = this.getContentPane();
        this.mainPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.mainPane.setLayout(new GridBagLayout());
        this.mainPane.setBackground(Color.darkGray);
    }
    public void makePublic() {
        this.setMinimumSize(new Dimension(1000, 600));
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void setMainPaneUI() {
        Insets insets = new Insets(5,5,5,5);

        DisplayPanel displayPanel = new DisplayPanel();
        displayPanel.setPanelUI();
        GridBagConstraints constraints1 = displayPanel.getConstraints(insets);
        this.mainPane.add(displayPanel, constraints1);

        GamePanel gamePanel = new GamePanel();
        gamePanel.setPanelUI();
        GridBagConstraints constraints2 = gamePanel.getConstraints(insets);
        this.mainPane.add(gamePanel, constraints2);
    }
}
