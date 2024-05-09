package Game;

import Game.Core.Plant;
import Game.Core.SunToken;
import Game.Core.Zombie;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    public static final int BOARD_WIDTH = 9;
    public static final int BOARD_HEIGHT = 6;

    private char[][] board;
    private List<Plant> plants;
    private static List<Zombie> zombies;

    public static List<Zombie> getZombies() {
        return zombies;
    }

    public GameBoard() {
        board = new char[BOARD_HEIGHT][BOARD_WIDTH];
        plants = new ArrayList<>();
        zombies = new ArrayList<>();
        initializeBoard();
    }


    private void initializeBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void addPlant(Plant plant, int row, int col) {
        plants.add(plant);
        board[row][col] = plant.getSymbol();
    }

    public void addZombie(Zombie zombie, int row, int col) {
        zombies.add(zombie);
        board[row][col] = zombie.getSymbol();
    }

    public void displayBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.print(board[i][j] + "[]");
            }
            System.out.println();
        }
    }
}
