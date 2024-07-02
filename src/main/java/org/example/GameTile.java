package org.example;
import javax.swing.JLabel;
import java.awt.*;

public class GameTile extends JLabel {
    public GameTile(Color bb){
            this.setSize(9,9);
            this.setText("bla");
            this.setBackground(bb);
            this.setBorder(null);
    }
}
