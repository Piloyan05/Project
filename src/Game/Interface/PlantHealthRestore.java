package Game.Interface;

import Game.Core.Plant;
import Game.Interface.BuyableStuff;

public class PlantHealthRestore implements BuyableStuff {
    private Plant p;
    double health = (double)(p.getHealth());

    public PlantHealthRestore(Plant p, double health) {
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