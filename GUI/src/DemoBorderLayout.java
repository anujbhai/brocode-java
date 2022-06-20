import javax.swing.*;
import java.awt.*;

public class DemoBorderLayout extends BorderLayout {
    DemoBorderLayout() {
        // Layout manager = Defines the natural layout for components within a container
        // 3 common managers
        // BorderLayout = Places components in five areas: NORTH, SOUTH, EAST, WEST, CENTER.
        // All extra space is placed in the center area.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(new Color(0x49A59A));
        panel2.setBackground(new Color(0xF8F4D1));
        panel3.setBackground(new Color(0xF0F0F0));
        panel4.setBackground(new Color(0xE5E4C5));
        panel5.setBackground(new Color(0x5C306B));

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        /**************
         * SUB PANELS *
         **************/

        panel3.setLayout(new BorderLayout(10, 10));

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(new Color(0x333333));
        panel7.setBackground(new Color(0xA6A4A4));
        panel8.setBackground(new Color(0xDEDEDE));
        panel9.setBackground(new Color(0x5C2828));
        panel10.setBackground(new Color(0xF0F0F0)); // CENTER

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.CENTER);

        panel3.add(panel6, BorderLayout.NORTH);
        panel3.add(panel7, BorderLayout.WEST);
        panel3.add(panel8, BorderLayout.EAST);
        panel3.add(panel9, BorderLayout.SOUTH);
        panel3.add(panel10, BorderLayout.CENTER);
    }
}
