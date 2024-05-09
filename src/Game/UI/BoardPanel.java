package Game.UI;

import Game.Core.PeaShooter;
import Game.Core.Plant;
import Game.Core.Sunflower;
import Game.Core.WallNut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class BoardPanel extends JPanel {
    private boolean gameStarted = false;
    private List<Plant> plants = new ArrayList<>();
    private String currentPlantType;
    private final int numRows = 6;
    private final int numCols = 9;
    private final int cellWidth;
    private final int cellHeight;

    public BoardPanel() {
        setBackground(Color.WHITE);
        this.cellWidth = getWidth() / numCols;
        this.cellHeight = getHeight() / numRows;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (gameStarted) {
                    int col = e.getX() / cellWidth;
                    int row = e.getY() / cellHeight;
                    addPlant(col * cellWidth + cellWidth / 2, row * cellHeight + cellHeight / 2);
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
        for (Plant plant : plants) {
            plant.draw(g);
        }
    }

    private void drawGrid(Graphics g) {
        g.setColor(Color.GRAY);
        // Draw vertical lines
        for (int i = 1; i < numCols; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }
        // Draw horizontal lines
        for (int j = 1; j < numRows; j++) {
            int y = j * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }
    }

    public void setCurrentPlantType(String plantType) {
        this.currentPlantType = plantType;
    }

    private void addPlant(int x, int y) {
        if (currentPlantType == null || !gameStarted) return;

        Plant newPlant = null;
        switch (currentPlantType) {
            case "Sunflower":
                newPlant = new Sunflower(x - 10, y - 10);
                break;
            case "WallNut":
                newPlant = new WallNut(x - 10, y - 10);
                break;
            case "Pea Shooter":
                newPlant = new PeaShooter(x - 10, y - 10);
                break;
        }

        if (newPlant != null && isPositionAvailable(newPlant.getX(), newPlant.getY())) {
            plants.add(newPlant);
            repaint();
        }
    }

    private boolean isPositionAvailable(int x, int y) {
        for (Plant plant : plants) {
            if (Math.abs(plant.getX() - x) < 10 && Math.abs(plant.getY() - y) < 10) {
                return false;
            }
        }
        return true;
    }

    public void startGame() {
        gameStarted = true;
        repaint();
    }
}