package Game.UI;

import javax.swing.*;
import java.awt.*;

public class PlantSelectionPanel extends JPanel {
    public PlantSelectionPanel(BoardPanel boardPanel) {
        setLayout(new GridLayout(1, 5));  // Three buttons in a row

        JButton sunflowerButton = new JButton("Sunflower");
        sunflowerButton.addActionListener(e -> boardPanel.setCurrentPlantType("Sunflower"));
        add(sunflowerButton);

        JButton walnutButton = new JButton("WallNut");
        walnutButton.addActionListener(e -> boardPanel.setCurrentPlantType("WallNut"));
        add(walnutButton);

        JButton peaShooterButton = new JButton("Pea Shooter");
        peaShooterButton.addActionListener(e -> boardPanel.setCurrentPlantType("PeaShooter"));
        add(peaShooterButton);

        JButton repeaterButton = new JButton("Repeater");
        repeaterButton.addActionListener(e -> boardPanel.setCurrentPlantType("Repeater"));
        add(repeaterButton);

        JButton potatoMine = new JButton("Potato Mine");
        potatoMine.addActionListener(e -> boardPanel.setCurrentPlantType("PotatoMine"));
        add(potatoMine);
    }
}
