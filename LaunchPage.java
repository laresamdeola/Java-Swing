import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaunchPage implements ActionListener {
  JButton button;
  JFrame frame;

  LaunchPage() {
    frame = new JFrame();
    button = new JButton("Hello");

    button.setBackground(Color.lightGray);
    button.setBounds(100, 160, 200, 40);
    button.setFocusable(false);
    button.addActionListener(this);

    frame.setSize(500, 500);
    frame.add(button);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      frame.dispose();
      NewWindow window = new NewWindow();
    }
  }
}