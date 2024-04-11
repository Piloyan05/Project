import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private static final int BOARD_WIDTH = 9;
    private static final int BOARD_HEIGHT = 6;

    private char[][] board; // Represents the game board
    private List<Plant> plants;
    private List<Zombie> zombies;

    public GameBoard() {
        this.board = new char[BOARD_HEIGHT][BOARD_WIDTH];
        this.plants = new ArrayList<>();
        this.zombies = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        // Fill the board with empty spaces
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int col = 0; col < BOARD_WIDTH; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public void addPlant(Plant plant, int row, int col) {
        if (isValidPosition(row, col)) {
            plants.add(plant);
            board[row][col] = 'P'; // Place plant on the board
        } else {
            System.out.println("Invalid plant placement!");
        }
    }

    public void addZombie(Zombie zombie, int row, int col) {
        if (isValidPosition(row, col)) {
            zombies.add(zombie);
            board[row][col] = 'Z'; // Place zombie on the board
        } else {
            System.out.println("Invalid zombie placement!");
        }
    }

    public void startGame() {
        System.out.println("Initial Game Board:");
        renderBoard();

        // Simulate game rounds
        while (!plants.isEmpty() && !zombies.isEmpty()) {
            performRound();
            renderBoard();
        }

        // Game over
        if (plants.isEmpty()) {
            System.out.println("Game over! Zombies win!");
        } else {
            System.out.println("Game over! Plants win!");
        }
    }

    private void performRound() {
        // Plants attack zombies
        for (Plant plant : plants) {
            if (!zombies.isEmpty()) {
                Zombie targetZombie = zombies.get(0); // Attack the first zombie
                plant.attack(targetZombie);
                if (!targetZombie.isAlive()) {
                    zombies.remove(0); // Remove defeated zombie
                }
            }
        }

        // Zombies attack plants
        for (Zombie zombie : zombies) {
            if (!plants.isEmpty()) {
                Plant targetPlant = plants.get(0); // Attack the first plant
                zombie.attack(targetPlant);
                if (!targetPlant.isAlive()) {
                    plants.remove(0); // Remove destroyed plant
                }
            }
        }
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < BOARD_HEIGHT && col >= 0 && col < BOARD_WIDTH;
    }

    private void renderBoard() {
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int col = 0; col < BOARD_WIDTH; col++) {
                System.out.print("[" + board[row][col] + "]");
            }
            System.out.println(); // Move to the next row
        }
        System.out.println(); // Blank line for separation
    }
}
