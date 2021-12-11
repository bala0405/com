package UI;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        this.setTitle("GOOGLE");
        ImageIcon image = new ImageIcon("logo.png");
        this.getContentPane().setBackground(new Color(29, 26, 26));
        this.setIconImage(image.getImage());
        this.setSize(640,720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
