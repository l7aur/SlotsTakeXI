import javax.swing.*;
import java.awt.*;

public class ButtonPane extends JPanel {
    public ButtonPane(int numberOfButtons, String[] buttonNames) {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setPreferredSize(new Dimension(400, 50));
        for (int i = 0; i < numberOfButtons; i++) {
            this.addHFiller();
            this.addButton(buttonNames[i]);
        }
        this.addHFiller();
    }
    public void addButton(String buttonName) {
        JButton button = new JButton(buttonName);
        this.add(button);
    }
    public void addHFiller() {
        this.add(Box.createHorizontalGlue());
    }
}
