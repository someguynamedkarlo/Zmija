package org.example;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Timer;

public class GameFrame extends JFrame {
    private int x;
    private int y;

    private DisplayGraphics m=new DisplayGraphics("rec",x,y ,3);
    private GamePanel n = new GamePanel();
    public GameFrame() {

        this.x=100;
        this.y=100;
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
        this.y -= 10;
        m.setCoordinates(x,y);
        repaint();
    }

    public void moveDown() {
        this.y += 10;
        m.setCoordinates(x,y);
        repaint();
    }

    public void moveLeft() {
        this.x -= 10;
        m.setCoordinates(x,y);
        repaint();
    }

    public void moveRight() {
        this.x += 10;
        m.setCoordinates(x,y);
        repaint();
    }
}
