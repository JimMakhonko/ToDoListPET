package classes;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;

    public AppFrame() {
        this.setSize(400,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();
        this.add(title, BorderLayout.NORTH);
    }
}
