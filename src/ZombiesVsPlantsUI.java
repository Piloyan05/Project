import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZombiesVsPlantsUI extends JFrame {
        private JLabel titleLabel;
        private JButton startButton;
        private JPanel mainPanel;

        public ZombiesVsPlantsUI() {
            setTitle("Zombies vs. Plants");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());

            titleLabel = new JLabel("Welcome to Zombies vs. Plants!");
            titleLabel.setHorizontalAlignment(JLabel.CENTER);
            mainPanel.add(titleLabel, BorderLayout.NORTH);

            startButton = new JButton("Start Game");
            startButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Add action to start the game
                    JOptionPane.showMessageDialog(ZombiesVsPlantsUI.this, "Game started!");
                }
            });
            mainPanel.add(startButton, BorderLayout.CENTER);

            add(mainPanel);
}
}
