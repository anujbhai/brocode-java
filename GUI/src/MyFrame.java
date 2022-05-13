import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("A suitable title for our JFrame.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 600);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("icons8-code-48.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x00838f));
    }
}
