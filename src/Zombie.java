public abstract class Zombie extends Mob{

    public String name;
    private int speed;
    private int row;
    private int col;
    private int health;
    private int limit;
    private long lastAttack;
    private double attackWaitingTime;


    public int getLimit() {
        return limit;
    }

    public long getLastAttack() {
        return lastAttack;
    }
    public void setLastAttack(long lastAttack) {
        this.lastAttack = lastAttack;
    }

    public double getAttackWaitingTime() {
        return attackWaitingTime;
    }
    public void seAttackWaitingTime(double val){
        attackWaitingTime = val;
    }

    public Zombie(int xCoordinate, int yCoordinate, int speed, int row, int col, int health){
        super(xCoordinate, yCoordinate, speed);
        this.speed = speed;
        this.col = col;
        this.row = row;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
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
    public void act() {

    }


}
