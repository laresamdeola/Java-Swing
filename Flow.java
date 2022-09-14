import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow {
  Flow() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    panel.setPreferredSize(new Dimension(100, 400));
    panel.setBackground(new Color(100, 0, 150));
    panel.setLayout(new FlowLayout()); // it's default is the Flow Layout

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5)); // it's default is the Border Layout
    for (int i = 1; i < 9; i++) {
      panel.add(new JButton(String.format("%d", i)));
    }
    frame.add(panel);
    frame.setVisible(true);
  }
}