import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
//public class MyFrame extends JFrame {
    JButton btn;
    JLabel lbl;
    boolean lblVisibleState = false;
    public boolean setLblVisibleState(boolean val) {
        val = lblVisibleState;
        return !val;
    }

    MyFrame() {
        ImageIcon icon = new ImageIcon("right.png");
        ImageIcon iconSurprised = new ImageIcon(("surprised.png"));

        lbl = new JLabel();
        lbl.setIcon(iconSurprised);
        lbl.setBounds(150, 250, 150, 150);
        lbl.setVisible(lblVisibleState);

        btn = new JButton();
        btn.setBounds(200, 100, 240, 100);
//        btn.addActionListener(e -> System.out.println("bar .."));
        btn.addActionListener(this);
        btn.setText("Click here!!");
        btn.setFocusable(false);
        btn.setIcon(icon);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);
        btn.setFont(new Font("Operator Mono", Font.BOLD, 25));
        btn.setIconTextGap(-5);
        btn.setForeground(Color.BLUE);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle("A suitable title for our JFrame.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setSize(800, 600);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("icons8-code-48.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x00838f));
        this.add(btn);
        this.add(lbl);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
//            System.out.println("Foo!");
//            btn.setEnabled(false);
            lbl.setVisible(setLblVisibleState(!lblVisibleState));
        }
    }
}
