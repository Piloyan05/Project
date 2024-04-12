public class Repeater extends Shooter{

    private static long lastAdded;
    public Repeater(int x, int y) {
        super(x, y, 0, 100, 100, 10, 25, 1);
    }


    @Override
    public void act() {}

    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {Repeater.lastAdded = lastAdded;}
}
