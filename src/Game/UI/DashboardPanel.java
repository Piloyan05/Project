package Game.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPanel extends JPanel {
    private JButton startButton;
    private JLabel sunTokensLabel;
    private BoardPanel boardPanel;


    public DashboardPanel(BoardPanel boardPanel) {
        this.boardPanel = boardPanel;

        setLayout(new FlowLayout(FlowLayout.LEFT));
        startButton = new JButton("Start");
        add(startButton);

        sunTokensLabel = new JLabel("Sun Tokens: 0");
        add(sunTokensLabel);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boardPanel.startGame();
            }
        });
    }
}
