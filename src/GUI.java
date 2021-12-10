import javax.swing.*;
import java.awt.*;

public class GUI
{
    public GUI()
    {
        //Adding a basic frame
        JFrame frame = new JFrame();
        JLabel label = new JLabel("G O O G L E");
        label.setBounds(400,100,100,100);
        //Adding panel
        JPanel panel = new JPanel();
        //crating buttons
        JButton b1 = new JButton("Search");
        JButton b2 = new JButton("I'm Feeling Lucky");
        b1.setBounds(240,250,90,30);
        b2.setBounds(350,250,400,30);
        //modifying panel
        panel.add(label);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        panel.setLayout(new GridLayout(0,1));
        //updating into the frame
        panel.setSize(100,100);
        frame.add(b1);
        frame.add(b2);
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Google");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String []args)
    {
        new GUI();
    }
}
