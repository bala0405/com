package UI;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

import com.MyLabel;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        MyLabel label = new MyLabel("GOOGLE");//Creates and set properties of a label
        ImageIcon image = new ImageIcon("logo.png");
        this.setTitle("GOOGLE");
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setIconImage(image.getImage());
      //  this.setSize(640,720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(label);
        this.pack();

    }
}
