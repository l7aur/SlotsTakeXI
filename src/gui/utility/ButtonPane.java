package gui.utility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonPane extends JPanel {
    public ButtonPane(int numberOfButtons, String[] buttonNames, ActionListener[] actionListeners)  {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(400, 50));
        try {
            this.placeNButtons(numberOfButtons, buttonNames, actionListeners);
        }
        catch (Exception e) {
            System.out.println("Wrong Parameter Format");
        }
    }
    public void placeNButtons(int numberOfButtons, String[] buttonNames, ActionListener[] actionListeners) throws Exception {
        if(actionListeners.length != numberOfButtons || buttonNames.length != numberOfButtons)
            throw new Exception("Wrong parameter format");
        for (int i = 0; i < numberOfButtons; i++) {
            this.addHFiller();
            this.addButton(buttonNames[i], actionListeners[i]);
        }
        this.addHFiller();
    }
    public void addButton(String buttonName, ActionListener actionListener) {
        JButton button = new JButton(buttonName);
        button.addActionListener(actionListener);
        this.add(button);
    }
    public void addHFiller() {
        this.add(Box.createHorizontalGlue());
    }
}
