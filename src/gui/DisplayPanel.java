package gui;

import notgui.Account;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    public DisplayPanel() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setBackground(Color.red);
    }
    public void addSoldDisplay(Account account) {
        int sold;
        try {
            sold = account.getSold();
        }
        catch (NullPointerException exception) {
            sold = 0;
        }
        JLabel label = new JLabel("Current Sold: " + sold);
        label.setAlignmentY(CENTER_ALIGNMENT);
        this.add(label);
    }
}
