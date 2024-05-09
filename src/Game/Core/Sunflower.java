package Game.Core;
import java.awt.Color;
import java.awt.Graphics;

import Game.*;

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

    @Override
    public char getSymbol() {
        return 'S';
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 20, 20);
    }

    @Override
    protected void add(Plant plant) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
