package org.example;
import java.awt.*;
import javax.swing.*;
public class DisplayGraphics extends JComponent {
    private int x;
    private int y;
    private String z;
    private int smjer;

    public DisplayGraphics(String z,int x, int y,int smjer) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.smjer = smjer;
        this.setBackground(Color.black  );
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // Kasting u Graphics2D
        if(z == "rec"){
            setForeground(Color.green);
            g2d.fillRect(x, y, 50, 50);
        }else if(z == "cir"){
            setForeground(Color.red);
            g2d.fillOval(x, y, 50, 50);
        }
        g2d.fillOval(x, y, 50, 50);

    }
    private void drawRectangle(Graphics2D g2d, int x, int y, int width, int height) {
        g2d.setColor(Color.BLUE);
        g2d.fillRect(x, y, width, height);
    }
    private void drawOval(Graphics2D g2d, int x, int y, int width, int height) {
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, width, height);
    }
    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
        repaint();
    }

    public void setShape(String z) {
        this.z = z;
        repaint();
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(900, 900); // Postavljanje preferirane veličine
    }
}
