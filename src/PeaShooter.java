public class PeaShooter extends Shooter{

    private static long lastAdded;
    public PeaShooter(int x, int y) {
        super(x, y, 0, 100, 100, 10, 25, 2);
    }


    @Override
    public void act() {

    }

    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {
        PeaShooter.lastAdded = lastAdded;
    }
}
