package Game.Core;

public abstract class Zombie extends Mob{

    public String name;

    public double speed;
    private int row;
    private int col;
    private double health;
    private int limit;

    public void setCol(int col) {
        this.col = col;
    }

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

    public Zombie(int xCoordinate, int yCoordinate, double speed, int row, int col, int health){
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
    public double getSpeed() {
        return speed;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
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
    public void act() {

    }

    public char getSymbol() {
        return 'z';
    }


}
