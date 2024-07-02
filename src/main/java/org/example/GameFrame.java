package org.example;

import javax.swing.JFrame;
import java.awt.*;

public class GameFrame extends JFrame {
    private int x;
    private int y;
    public GameFrame() {
        this.x=100;
        this.y=100;
        GamePanel n = new GamePanel();
        this.add(n);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        DisplayGraphics m=new DisplayGraphics("rec",100,100);
        int j = 0;
        while(j<400){
            m=new DisplayGraphics("rec",j,j);
            j++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        n.add(m);
        this.setLayout(new BorderLayout());
        this.pack();
        this.setSize(900, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.requestFocusInWindow();

    }
    //vanja jebemti mater
    public void moveUp() {
        this.y -= 10;
    }

    public void moveDown() {
        this.y += 10;
    }

    public void moveLeft() {
        this.x -= 10;
    }

    public void moveRight() {
        this.x += 10;
    }
}
