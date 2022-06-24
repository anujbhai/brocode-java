import javax.swing.*;
import java.awt.*;

public class DemoGridFlowLayout {
    DemoGridFlowLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame.add(new JButton("Click here 1!"));
        frame.add(new JButton("Click here 2!"));
        frame.add(new JButton("Click here 3!"));
        frame.add(new JButton("Click here 4!"));
        frame.add(new JButton("Click here 5!"));
        frame.add(new JButton("Click here 6!"));
        frame.add(new JButton("Click here 7!"));
        frame.add(new JButton("Click here 8!"));
        frame.add(new JButton("Click here 9!"));

        frame.setVisible(true);
    }
}
