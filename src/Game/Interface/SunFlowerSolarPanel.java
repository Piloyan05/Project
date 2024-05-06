package Game.Interface;

import Game.Core.SunTokenProducer;

public class SunFlowerSolarPanel implements BuyableStuff {
    private double speed;
    private SunTokenProducer waitTime;



    @Override
    public void speedUp(){
        speed = (waitTime.getTokenWaitingTime() * 0.75);
    }

    @Override
    public void increaseHealth() {

    }

    @Override
    public void speedDown() {

    }
}