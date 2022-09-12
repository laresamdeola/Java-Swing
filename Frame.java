import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Font;


public class Frame extends JFrame{
  Frame(){

    ImageIcon image = new ImageIcon("crown.png");
    Border border = BorderFactory.createLineBorder(Color.green, 3);
    JLabel label = new JLabel();

    label.setText("Hello World");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of image icon
    label.setForeground(new Color(0, 255, 0)); // set font color of text
    label.setFont(new Font("Times New Roman", Font.PLAIN, 50)); // set font of text
    label.setIconTextGap(-25); // set gap of text to image
    label.setBackground(Color.black); // set background color
    label.setOpaque(true); // display background color
    label.setBorder(border); // sets border of label (not image+text)
    label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
    label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + text within label
    //label.setBounds(100, 100, 250, 250); //set x,y position within fram as well as dimensions of the label
      
    this.setTitle("First Swing Application");
    //this.setSize(600, 600);
    //this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    //this.getContentPane().setBackground(new Color(123,50,250));
    this.setVisible(true);
    this.add(label);
    this.pack();
  }
}