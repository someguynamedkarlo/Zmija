package org.example;

import javax.swing.JFrame;
import java.awt.*;

public class GameFrame extends JFrame {
    //private GameTile[][] gameTiles = new GameTile[100][100];
    public GameFrame() {
        GamePanel n = new GamePanel();
        this.add(n);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        DisplayGraphics m=new DisplayGraphics("rec",100,100);
        n.add(m);
        this.setLayout(new BorderLayout());
        this.pack();
        this.setSize(900, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        /*for(int i = 0;i<100;i++){
            for(int j = 0;j<100;j++){
                gameTiles[i][j] = new GameTile(Color.black);

                n.add(gameTiles[i][j]);
            }
        }*/

    }
}
