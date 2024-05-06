package Game.Core;

public abstract class Plant extends Mob  {

    private final int price;
    private double health;
    private long waitingTime;//coolDownTime


    public Plant(int xCoordinate, int yCoordinate, int speed, int price, int health, long waitingTime){
        super(xCoordinate, yCoordinate, speed);
        this.price = price;
        this.health = health;
        this.waitingTime = waitingTime;
    }

    public abstract void act();

    public int getPrice(){
        return price;
    }

    public double getHealth(){
        return health;
    }

    public void decreaseHealth(int damage){
        health -= damage;
        if(health <=0){
            isDead = true;
        }
    }
    public char getSymbol(){
        return 'p';
    }
    public long getWaitingTime(){
        return waitingTime;
    }
}