package GUI;

import javax.swing.*;

public class SnakeFrame extends JFrame {
    private SnakePanel panel;
    public SnakeFrame(){
        panel = new SnakePanel();

        this.add(panel);
        this.setTitle("Snake");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

}
