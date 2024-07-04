package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private GameFrame gameFrame;

    public KeyHandler(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used, but required to be implemented
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                gameFrame.setDirection(0);
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                gameFrame.setDirection(2);
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                gameFrame.setDirection(3);
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                gameFrame.setDirection(1);
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
