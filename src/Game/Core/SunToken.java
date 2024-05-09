package Game.Core;

public class SunToken extends Mob {
    private double lastDropped;
    private int limit;
    private int value;
    public SunToken(int x, int y, int limit) {
        super(x, y, 2);
        this.limit=limit;
        value=25;
    }
    public SunToken(int x, int y) {
        super(x, y, 0);
        limit=0;
        value=50;
    }

    public int getValue(){
        return value;
    }


    @Override
    public void act(){
        if(getyCoordinate()<limit) {
            setyCoordinate(getyCoordinate()-1);
        }
    }

    public double getLastDropped() {
        return lastDropped;
    }
    public void setLastDropped(double lastDropped) {
        this.lastDropped = lastDropped;
    }
}
