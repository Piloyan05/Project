package Game.Core;

public abstract class Shooter extends Plant{
    private final int damage;
    private final double bulletWaitingTime;
    private long lastBulletFired;

    public Shooter(int x, int y, int speed, int price, int health, long waitingTime, int damage, double bulletWaitingTime) {
        super(x, y, speed, price,health, waitingTime);
        this.damage = damage;
        this.bulletWaitingTime = bulletWaitingTime;
        this.lastBulletFired=0;
    }

    public int getDamage() {
        return damage;
    }

    public double getBulletWaitingTime() {
        return bulletWaitingTime;
    }

    public long getLastBulletFired() {
        return lastBulletFired;
    }
    public void setLastBulletFired(long lastBulletFired) {
        this.lastBulletFired = lastBulletFired;
    }

    @Override
    public abstract void act();
}
