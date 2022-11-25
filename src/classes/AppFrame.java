package classes;

import javax.swing.*;

public class AppFrame extends JFrame {
    private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;

    public AppFrame() {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
