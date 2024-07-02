package org.example;
import org.example.GameFrame;
import org.example.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    private GameFrame gameFrame;

    public KeyHandler(GameFrame gamePanel) {
        this.gameFrame = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used, but required to be implemented
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Detect arrow keys and WASD keys
        switch (keyCode) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                System.out.println("Up key or W key pressed");
                gameFrame.moveUp();
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                System.out.println("Down key or S key pressed");
                gameFrame.moveDown();
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                System.out.println("Left key or A key pressed");
                gameFrame.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                System.out.println("Right key or D key pressed");
                gameFrame.moveRight();
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used, but required to be implemented
    }
}
