package Game.Core;

import java.awt.Color;
import java.awt.Graphics;

public class PeaShooter extends Shooter{

    private static long lastAdded;
    private int x;
    private int y;
    public PeaShooter(int x, int y) {
        super(x, y, 0, 100, 100, 10, 25, 2);
    }


    @Override
    public void act() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - getLastBulletFired() >= getBulletWaitingTime()) {
            System.out.println("Pea shooter at (" + getxCoordinate() + ", " + getyCoordinate() + ") fires a pea!");
            setLastBulletFired(currentTime);
        }
    }

    public int shootPea() {
        return -(getDamage());
    }

    public String toString() {
        String Status= "";
        Status = "P = " + this.getBulletWaitingTime();
        return Status;
    }
    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {
        PeaShooter.lastAdded = lastAdded;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 20, 20); // Simple representation for demonstration
    }
    @Override
    protected void add(Plant plant) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
