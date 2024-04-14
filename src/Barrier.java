public abstract class Barrier extends Plant {
    public Barrier(int x, int y, int speed, int price, long waitingTime) {
        super(x, y, speed, price, 100, waitingTime);
    }

    @Override
    public abstract void act();
}
