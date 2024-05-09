package Game.Interface;

import Game.Core.Zombie;

public class ZombieSlowDown implements Buff {
    private Zombie z;
    private double speed = (z.getSpeed());

    public ZombieSlowDown(Zombie z) {
        this.z = z;
    }


    @Override
    public void increaseHealth() {

    }

    @Override
    public void speedDown() {
        this.speed = speed * 0.75;
    }

    @Override
    public void speedUp() {

    }
}