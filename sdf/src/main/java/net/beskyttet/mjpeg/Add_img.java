package net.beskyttet.mjpeg;

import javax.swing.*;
import java.awt.*;

public class Add_img extends JPanel {
    ImageIcon icon;
    Image img;
    static int width, height;
    static int x, y;

    Add_img(String url) {
        icon = new ImageIcon(url);
        img = icon.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, width,height, this);
    }
}
