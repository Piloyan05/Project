public abstract class Plant extends MutualElements  {

    private final int price;
    private int health;
    private static long waitingTime;
    private int row;
    private int col;

    public Plant(int xCoordinate, int yCoordinate, int speed, int price, int health, long waitingTime, int row, int col){
        super(xCoordinate, yCoordinate, speed);
        this.price = price;
        this.health = health;
        this.waitingTime = waitingTime;
        this.row = row;
        this.col = col;
    }

    public abstract void act();

    public int getPrice(){
        return price;
    }

    public int getHealth(){
        return health;
    }

    public void decreaseHealth(int damage){
        health -= damage;
        if(health <=0){
            isDead = true;
        }
    }

    public static long getWaitingTime(){
        return waitingTime;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
