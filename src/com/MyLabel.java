package com;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class MyLabel extends JLabel {

    public MyLabel(String text)
    {
        ImageIcon image = new ImageIcon("logo.png");
         this.setText(text);
         this.setIcon(image);
         this.setVerticalAlignment(JLabel.CENTER);
         this.setHorizontalAlignment(JLabel.CENTER);
    }
}
