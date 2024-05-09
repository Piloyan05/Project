package Game.Core;

import Game.GameBoard;
//import Game.UI.BoardSquare;

import java.awt.Graphics;
import java.util.List;

public class Repeater extends Shooter{

    private static long lastAdded;

    public Repeater(int x, int y) {
        super(x, y, 0, 100, 100, 10, 25, 1);
    }

    @Override
    public void act() {

        long currentTime = System.currentTimeMillis();
        if (currentTime - getLastBulletFired() >= getBulletWaitingTime()) {
            Zombie zombie = getZombieInSameRow(GameBoard.getZombies());
            if (zombie != null) {
                zombie.decreaseHealth(getDamage());
            }
            setLastBulletFired(currentTime);
        }
    }

    private Zombie getZombieInSameRow(List<Zombie> zombies) {
        int shooterY = getyCoordinate();
        for (Zombie zombie : zombies) {
            int zombieRow = zombie.getyCoordinate() / GameBoard.BOARD_WIDTH;
            int shooterRow = shooterY / GameBoard.BOARD_WIDTH;
            if (zombieRow == shooterRow) {
                return zombie;
            }
        }

        return null;
    }

    @Override
    public char getSymbol() {
        return 'R';
    }

    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {
        Repeater.lastAdded = lastAdded;
    }

    @Override
    protected void add(Plant plant) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
}
