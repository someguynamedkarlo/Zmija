package org.example;

public class Run implements Runnable {
    private GameFrame gameFrame;
    private int smjer = 2;
    private boolean running = true;

    public Run(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        new Thread(this).start(); // Start the thread
    }

    @Override
    public void run() {
        while (running) {
            switch (smjer) {
                case 0:
                    gameFrame.moveUp();
                    break;
                case 1:
                    gameFrame.moveRight();
                    break;
                case 2:
                    gameFrame.moveDown();
                    break;
                case 3:
                    gameFrame.moveLeft();
                    break;
            }
            try {
                Thread.sleep(4);  // Adjust the sleep time as needed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setSmjer(int smjer) {
        this.smjer = smjer;
    }

    public void stopRunning() {
        this.running = false;
    }
}
