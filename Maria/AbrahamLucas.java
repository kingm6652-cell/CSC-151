package groupproject_01;

import javax.swing.*;

public class AbrahamLucas {
    public AbrahamLucas() {
        JFrame frame = new JFrame("Abraham Lucas Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Abraham Lucas | Position: T | #23 | Age: 24 | College: Washington State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AbrahamLucas::new);
    }
}
