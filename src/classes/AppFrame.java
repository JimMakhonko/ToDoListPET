package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame {
    private TitleBar title;
    private List list;
    private ButtonPanel btnPanel;
    private JButton addTaskBtn;
    private JButton clearBtn;

    public AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        title = new TitleBar();
        list = new List();
        btnPanel = new ButtonPanel();
        this.add(title, BorderLayout.NORTH);
        this.add(btnPanel, BorderLayout.SOUTH);

        this.add(list, BorderLayout.CENTER);
        addTaskBtn = btnPanel.getAddTaskBtn();
        clearBtn = btnPanel.getClearBtn();
        addListeners();

    }

    public void addListeners() {
        addTaskBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                revalidate();
            }
        });
    }
}
