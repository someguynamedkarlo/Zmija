package org.example;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel{
    public GamePanel(){
            this.setLayout(new BorderLayout());
            this.setSize(900,900);
            this.setBackground(Color.black);
            this.setVisible(true);
    }
}
