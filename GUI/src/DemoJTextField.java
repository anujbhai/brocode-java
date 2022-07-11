import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJTextField extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;

    DemoJTextField() {
        // JTextField = A GUI Textbox component that can be used to add, set or get text.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0xDFFF00));
        textField.setBackground(new Color(0x663399));
        textField.setCaretColor(Color.white);
        textField.setText("Enter username");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        };
    }
}
