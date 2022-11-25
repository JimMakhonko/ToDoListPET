package classes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton addTaskBtn;
    private JButton clearBtn;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
        addTaskBtn = new JButton("Add Task");
        addTaskBtn.setBorder(emptyBorder);
        addTaskBtn.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        this.add(addTaskBtn);

        this.add(Box.createHorizontalStrut(20));
        clearBtn = new JButton("Clear completed Tasks");
        clearBtn.setBorder(emptyBorder);
        clearBtn.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
        this.add(clearBtn);
    }
public JButton getAddTaskBtn(){
        return addTaskBtn;
}
public JButton getClearBtn(){
        return clearBtn;
}
}
