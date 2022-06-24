import javax.swing.*;
import java.awt.*;

public class DemoFlowLayout extends FlowLayout {
    DemoFlowLayout() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("Click here 1!"));
        panel.add(new JButton("Click here 2!"));
        panel.add(new JButton("Click here 3!"));
        panel.add(new JButton("Click here 4!"));
        panel.add(new JButton("Click here 5!"));
        panel.add(new JButton("Click here 6!"));
        panel.add(new JButton("Click here 7!"));
        panel.add(new JButton("Click here 8!"));
        panel.add(new JButton("Click here 9!"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
