package Game.Interface;

import Game.Core.Plant;

public class PlantHealthRestore implements Buff  {
    private Plant p;
    double health = p.getHealth();

    public PlantHealthRestore(Plant p) {
        this.p = p;
    }

    @Override
    public void increaseHealth() {
        health = health * 1.25;
    }

    @Override
    public void speedDown() {

    }

    @Override
    public void speedUp() {

    }
}