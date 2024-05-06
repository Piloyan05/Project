package Game.Core;

import java.util.List;

public class PotatoMine extends Shooter{
    private boolean isArmed;

    public PotatoMine(int x, int y) {
        super(x, y, 0, 25, 100, 5000, 50, 5);
        this.isArmed = false;
    }
    public void act() {
        if (!isArmed) {
            long currentTime = System.currentTimeMillis();
            long plantedTime = currentTime - (5 - getWaitingTime());
            if (plantedTime >= 0) {
                isArmed = true;
            }
        }
    }

    public void explode(List<Zombie> zombies) {
        if (isArmed) {
            int mineRow = getyCoordinate();
            for (int i = 0; i < zombies.size(); i++) {
                Zombie zombie = zombies.get(i);
                if (zombie.getRow() == mineRow) {
                    zombie.decreaseHealth(getDamage());
                    if (zombie.isDead()) {
                        System.out.println("Game.Core.Zombie defeated!");
                    }
                    this.setDead(true);
                }
            }

        }
    }

    @Override
    public char getSymbol() {
        return 'P';
    }
}