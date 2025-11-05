import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        super("Sample");

        // Use java.awt.GridLayout
        setLayout(new java.awt.GridLayout(3, 2, 5, 10));

        JLabel l = new JLabel("Username:");
        JLabel l1 = new JLabel("Password:");
        JTextField t = new JTextField();
        JTextField t1 = new JTextField();
        JButton b = new JButton("OK");
        JButton b1 = new JButton("Cancel");

        add(l);
        add(t);
        add(l1);
        add(t1);
        add(b);
        add(b1);

        // Frame settings
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Frame();
    }
}
