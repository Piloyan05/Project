package Game.Core;

import java.awt.Color;
import java.awt.Graphics;

public class WallNut extends Barrier {


    private static long lastAdded;
    private int x;
    private int y;
    public WallNut(int x, int y) {
        super(x, y, 0, 50, 10);
    }


    @Override
    public void act() {
        if (getHealth() <= 25) {
            System.out.println("WallNut at (" + getxCoordinate() + ", " + getyCoordinate() + ") is damaged!");
        }
        if (isDead()) {
            System.out.println("WallNut at (" + getxCoordinate() + ", " + getyCoordinate() + ") is destroyed!");
        }
    }
    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {
        WallNut.lastAdded = lastAdded;
    }

    @Override
    public char getSymbol() {
        return 'W';
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 20, 20); // Simple representation for demonstration
    }


    @Override
    protected void add(Plant plant) {
    }

}
