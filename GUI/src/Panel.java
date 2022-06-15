import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("approval.png");

        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(236, 112, 99));
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(102, 153, 255));
        bluePanel.setBounds(250, 0, 250, 250);
//        bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(77, 182, 172));
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
