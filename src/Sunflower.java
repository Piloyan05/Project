public class Sunflower extends SunTokenProducer{
    public Sunflower(int x, int y) {
        super(x, y, 0, 50, 100, 5000, 10.0, 25);

    }

    @Override
    public void act() {
        long currentTime = System.currentTimeMillis();
        double timeSinceLastToken = (currentTime - getLastTokenAdded()) / 1000.0;
        if (timeSinceLastToken >= getTokenWaitingTime()) {
            produceSunToken();
            setLastTokenAdded(currentTime);
        }
    }

    private void produceSunToken() {
        SunToken sunToken = new SunToken(getxCoordinate(), getyCoordinate(), getSunProduction());
        GameBoard.addSunToken(sunToken);
    }

}
