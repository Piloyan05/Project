public abstract class SunTokenProducer extends Plant{
    private final double tokenWaitingTime;
    private long lastTokenAdded;
    private final int sunProduction;
    public SunTokenProducer(int x, int y, int speed, int price, int health, long waitingTime, double tokenWaitingTime, int sunProduction) {
        super(x, y, speed, price, health, waitingTime);
        this.tokenWaitingTime = tokenWaitingTime;
        this.lastTokenAdded=0;
        this.sunProduction = sunProduction;
    }

    @Override
    public abstract void act();

    public double getTokenWaitingTime() {
        return tokenWaitingTime;
    }

    public long getLastTokenAdded() {
        return lastTokenAdded;
    }
    public void setLastTokenAdded(long lastTokenAdded) {
        this.lastTokenAdded = lastTokenAdded;
    }

    public int getSunProduction() {
        return sunProduction;
    }
}