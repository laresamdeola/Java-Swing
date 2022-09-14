import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Dimension;

public class Grid {
  Grid() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    panel.setPreferredSize(new Dimension(100, 100));
    panel.setBackground(new Color(0, 50, 125));
    panel.setLayout(new GridLayout(2, 4, 2, 2));
    for (int i = 1; i < 9; i++) {
      panel.add(new JButton(String.format("%d", i)));
    }
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.add(panel);
    frame.setVisible(true);
  }
}