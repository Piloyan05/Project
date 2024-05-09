package Game.Core;

import java.util.List;

public class BossZombie extends Zombie {

    private final int BOSS_ZOMBIE_DAMAGE = 25;

    public BossZombie(int xCoordinate, int yCoordinate, int speed, int row, int col, int health) {
        super(xCoordinate, yCoordinate, 0.5, row, col, health);

    }



    public void act(List<Plant> plants) {
        if (canAttack(plants)) {
            attackPlant(plants);
        } else {
            moveForward();
        }
    }

    private boolean canAttack(List<Plant> plants) {
        for (Plant plant : plants) {
            if (plant.getX() == getxCoordinate() && plant.getY() == getyCoordinate()) {
                return true;
            }
        }
        return false;
    }

    private void attackPlant(List<Plant> plants) {
        for (Plant plant : plants) {
            if (plant.getX() == getxCoordinate() && plant.getY() == getyCoordinate()) {
                plant.decreaseHealth(BOSS_ZOMBIE_DAMAGE);
                break;
            }
        }
    }
    private void moveForward() {
        setCol(getCol() + 1);
    }
}
