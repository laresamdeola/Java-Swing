import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class Borders {
  Borders() {

    JPanel panelOne = new JPanel();
    JPanel panelTwo = new JPanel();
    JPanel panelThree = new JPanel();
    JPanel panelFour = new JPanel();
    JPanel panelFive = new JPanel();

    panelOne.setBackground(new Color(255, 0, 0));
    panelTwo.setBackground(new Color(0, 255, 0));
    panelThree.setBackground(new Color(0, 0, 255));
    panelFour.setBackground(new Color(255, 255, 255));
    panelFive.setBackground(new Color(0, 0, 0));

    panelOne.setPreferredSize(new Dimension(100, 100));
    panelTwo.setPreferredSize(new Dimension(100, 100));
    panelThree.setPreferredSize(new Dimension(100, 100));
    panelFour.setPreferredSize(new Dimension(100, 100));
    panelFive.setPreferredSize(new Dimension(100, 100));

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new BorderLayout(10, 0));
    frame.setVisible(true);

    frame.add(panelOne, BorderLayout.NORTH);
    frame.add(panelTwo, BorderLayout.WEST);
    frame.add(panelThree, BorderLayout.EAST);
    frame.add(panelFour, BorderLayout.SOUTH);
    frame.add(panelFive, BorderLayout.CENTER);
  }
}
