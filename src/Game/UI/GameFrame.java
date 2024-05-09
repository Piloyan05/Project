package Game.UI;

import Game.GameBoard;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameBoard[][] gameBoard;
    private BoardPanel boardPanel;

    public GameFrame() {
        setTitle("Plants vs Zombies");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        BoardPanel boardPanel = new BoardPanel();
        PlantSelectionPanel plantSelectionPanel = new PlantSelectionPanel(boardPanel);
        DashboardPanel dashboardPanel = new DashboardPanel(boardPanel);



        add(plantSelectionPanel, BorderLayout.SOUTH);
        add(dashboardPanel, BorderLayout.CENTER);


        setVisible(true);
    }


}
