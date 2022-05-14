import javax.swing.*;

public class Labels {
    // JLabel = a GUI display area for a string of text, an image, or both

    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("boy.png");

        JLabel label = new JLabel();
        label.setText("This is the painkiller!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        JFrame labelFrame = new JFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelFrame.setSize(800, 600);
        labelFrame.setVisible(true);
        labelFrame.add(label);
    }

}
