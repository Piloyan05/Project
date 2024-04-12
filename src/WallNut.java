public class WallNut extends Barrier{


    private static long lastAdded;
    public WallNut(int x, int y) {
        super(x, y, 0, 50, 10);
    }

    @Override
    public void act(){}

    public static long getLastAdded() {
        return lastAdded;
    }

    public static void setLastAdded(long lastAdded) {
        WallNut.lastAdded = lastAdded;
    }
}
