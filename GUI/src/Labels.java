import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    // JLabel = a GUI display area for a string of text, an image, or both

    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("boy.png");
        Border border = BorderFactory.createLineBorder(new Color(21, 101, 192), 3);

        JLabel label = new JLabel();
        label.setText("This is the painkiller!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setForeground(new Color(121, 134, 203));
        label.setFont(new Font("Century Schoolbook L", Font.PLAIN, 90));
        label.setIconTextGap(10);
        label.setBackground(new Color(179, 229, 252));
        label.setOpaque(true);
        label.setBorder(border);
//        label.setBounds(0, 0, 500, 500);

        JFrame labelFrame = new JFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        labelFrame.setLayout(null);
//        labelFrame.setSize(800, 600);
        labelFrame.setVisible(true);
        labelFrame.add(label);
        labelFrame.pack();
    }

}
