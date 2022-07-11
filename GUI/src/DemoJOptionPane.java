import javax.swing.*;

public class DemoJOptionPane {
    DemoJOptionPane() {
        // JOptionPane = Popup a standard dialog box that prompts user for a value
                            // or informs them of something

//        String plain_msg = "Let the wind carry you home, black bird fly away!";
//        String info_msg = "May you never be broken again!";
        String question_msg = "Beyond the suffering you’ve known, I hope you find your way! But how?";
//        String warning_msg = "Know that you've made such a difference!";
//        String err_msg = "All you leave behind will live to the end!";
//        JOptionPane.showMessageDialog(null, plain_msg, "Blackbird", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, info_msg, "Blackbird", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, question_msg, "Blackbird", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, warning_msg, "Blackbird", JOptionPane.WARNING_MESSAGE);
//        while(true) {
//            JOptionPane.showMessageDialog(null, err_msg, "Blackbird", JOptionPane.ERROR_MESSAGE);
//        }

//        int answer = JOptionPane.showConfirmDialog(null, question_msg, "Blackbird", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);
        String[] responses = {"No, You're awesome!", "Thanks!", "*Blush*"};
        ImageIcon icon = new ImageIcon("smiling.png");
        JOptionPane.showOptionDialog(
            null,
            "You are awesome!",
            "Secret Message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0
        );
    }

}
