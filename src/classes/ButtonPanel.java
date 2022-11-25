package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;

Border emptyBorder = BorderFactory.createEmptyBorder();
    ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
        this.setBackground(Color.red);

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        this.add(addTask);
    }

}
