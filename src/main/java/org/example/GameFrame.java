package org.example;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Timer;

public class GameFrame extends JFrame {
    private int x;
    private int y;

    private DisplayGraphics m=new DisplayGraphics("rec",300,300 ,3);
    private GamePanel n = new GamePanel();
    public GameFrame() {

        this.x=300;
        this.y=300;
        this.addKeyListener(new KeyHandler(this));
        this.add(n);
        this.setTitle("Snake");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        n.add(m);
        this.setLayout(new BorderLayout());
        this.pack();
        this.setSize(900, 900);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    public void moveUp() {
        System.out.println(this.y);
        if (this.y-20 >= 0) {
            this.y-=20;
            m.setCoordinates(x, y);
            repaint();
        }
    }

    public void moveDown() {
        if (this.y+20 < 850) {
            this.y += 20;
            m.setCoordinates(x, y);
            repaint();
        }
    }

    public void moveLeft() {
        if (this.x-20 >= 0) {
            this.x -= 20;
            m.setCoordinates(x, y);
            repaint();
        }
    }

    public void moveRight() {
        if (this.x + 20 < 850) {
            this.x += 20;
            m.setCoordinates(x, y);
            repaint();
        }
    }
}
