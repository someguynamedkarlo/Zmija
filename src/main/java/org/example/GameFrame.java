package org.example;

import javax.swing.JFrame;
import java.awt.*;

public class GameFrame extends JFrame {
    private DisplayGraphics m = new DisplayGraphics("rec", 300, 300, 3);
    private GamePanel n = new GamePanel();
    private Run run;
    private int x = 300;
    private int y = 300;

    public GameFrame() {
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(900, 900);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.add(n);
        n.add(m);

        this.addKeyListener(new KeyHandler(this));

        this.pack();

        // Initialize Run instance
        this.run = new Run(this);
    }

    public void moveUp() {
        System.out.println(this.y);
        if (this.y-1 >= 0) {
            this.y-=1;
            m.setCoordinates(x, y);
            repaint();
        }else{
            run.stopRunning();
        }
    }

    public void moveDown() {
        if (this.y+1 < 850) {
            this.y += 1;
            m.setCoordinates(x, y);
            repaint();
        }else{
            run.stopRunning();
        }
    }

    public void moveLeft() {
        if (this.x-1 >= 0) {
            this.x -= 1;
            m.setCoordinates(x, y);
            repaint();
        }else{
            run.stopRunning();
        }
    }

    public void moveRight() {
        if (this.x + 1 < 850) {
            this.x += 1;
            m.setCoordinates(x, y);
            repaint();
        }else{
            run.stopRunning();
        }
    }

    public void setDirection(int direction) {
        run.setSmjer(direction);
    }
}
