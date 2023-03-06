import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Emil GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        new GUI();

    }
}