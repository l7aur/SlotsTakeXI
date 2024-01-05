package gui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        super();
                            this.setBackground(Color.yellow);
    }
    public GridBagConstraints getConstraints(Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = insets;
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 5;
        constraints.gridheight = 5;
        return constraints;
    }
    public void setPanelUI() {
        this.setPreferredSize(new Dimension(600,400));
    }
}
