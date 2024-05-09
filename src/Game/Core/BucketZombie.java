package Game.Core;

import java.util.List;

public class BucketZombie extends Zombie {

    private int armor;

    public BucketZombie(int xCoordinate, int yCoordinate, int speed, int row, int col, int health, int armor) {
        super(xCoordinate, yCoordinate, speed, row, col, health);
        this.armor = armor;
        this.name = "Bucket Zombie";
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void decreaseHealth(int damage) {
        if (armor > 0) {
            if (armor >= damage) {
                armor -= damage;
                damage = 0;
            } else {
                damage -= armor;
                armor = 0;
            }
        }
        if (damage > 0) {
            super.decreaseHealth(damage);
        }
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
                plant.decreaseHealth(20);
                break;
            }
        }
    }

    private void moveForward() {
        setCol(getCol() + 1);
    }
}
