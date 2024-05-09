package Game.Core;

import java.util.List;

public class MiniZombie extends Zombie {

    private final int MINI_ZOMBIE_DAMAGE = 10; // Damage dealt by MiniZombie
    private final int MINI_ZOMBIE_SPEED = 2;   // Speed of MiniZombie

    public MiniZombie(int xCoordinate, int yCoordinate, int row, int col, int health) {
        super(xCoordinate, yCoordinate,2, row, col, health);
        this.name = "Mini Zombie";
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
                plant.decreaseHealth(MINI_ZOMBIE_DAMAGE);
                break;
            }
        }
    }
    private void moveForward() {
        setCol(getCol() + 1);
    }
}
