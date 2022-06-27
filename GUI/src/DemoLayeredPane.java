import javax.swing.*;
import java.awt.*;

public class DemoLayeredPane {
    DemoLayeredPane() {
        // JLayeredPane = Swing container that provides a
        //                  third dimension for positioning components
        //                  Eg.: depth, z-index

        JLayeredPane layeredPane = new JLayeredPane();

        JFrame frame = new JFrame("JLayeredPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
