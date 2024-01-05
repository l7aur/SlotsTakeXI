package gui;

import gui.utility.ButtonPane;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    public DisplayPanel() {
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
    public void setPanelUI() {
        this.setPreferredSize(new Dimension(400,400));
        this.addVFiller();
        this.addDisplayText();
        this.addVFiller();
        this.addButtonPanel();
    }
    public void addButtonPanel() {
        ButtonPane buttonPane = new ButtonPane(2, new String[]{"ROLL BUTTON", "CHANGE BID"});
        this.add(buttonPane);
    }
    public void addDisplayText() {
        JButton button = new JButton("TODO");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setPreferredSize(new Dimension(100,50));
        button.add(Box.createRigidArea(new Dimension(100,50)));
        this.add(button);
    }
    private void addVFiller() {
        this.add(Box.createVerticalGlue());
    }
}
