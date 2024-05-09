package Game.Core;

public abstract class Mob{

    private int xCoordinate;
    private int yCoordinate;
    protected boolean isDead;
    private double speed;

    public Mob(int xCoordinate, int yCoordinate, double speed){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
        this.isDead = false;
    }

    public int getxCoordinate(){
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate){
        this.xCoordinate += xCoordinate;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean isDead){
        this.isDead = isDead;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getyCoordinate(){
        return yCoordinate;
    }
    public void setyCoordinate(int yCoordinate){
        this.yCoordinate += yCoordinate;
    }



    public abstract void act();


}