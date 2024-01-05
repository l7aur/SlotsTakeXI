package gui;

import gui.utility.ButtonPane;
import gui.utility.ChangeBidActionListener;
import gui.utility.RollActionListener;
import notgui.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class IOPanel extends JPanel {
    public IOPanel() {
        super();
                            this.setBackground(Color.lightGray);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
    public GridBagConstraints getConstraints(Insets insets) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = insets;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        return constraints;
    }
    public void setPanelUI(Account account) {
        this.setPreferredSize(new Dimension(400,400));
        this.addVFiller();
        this.addDisplayPanel(account);
        this.addVFiller();
        this.addButtonPanel();
    }
    public void addButtonPanel() {
        ButtonPane buttonPane = new ButtonPane(2, new String[]{"ROLL BUTTON", "CHANGE BID"},
                                               new ActionListener[] {new RollActionListener(), new ChangeBidActionListener()});
        this.add(buttonPane);
    }
    public void addDisplayPanel(Account account) {
        DisplayPanel displayPanel = new DisplayPanel();
        displayPanel.addSoldDisplay(account);
        displayPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        displayPanel.setPreferredSize(new Dimension(100,50));
        this.add(displayPanel);
    }
    public void refreshDisplayPanel(Account account) {
        for (Component component : this.getComponents()) {
            if(component instanceof DisplayPanel)
                this.remove(component);
        }
        this.addDisplayPanel(account);
    }
    private void addVFiller() {
        this.add(Box.createVerticalGlue());
    }
}
