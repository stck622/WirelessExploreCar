package net.beskyttet.mjpeg;

import net.sf.jipcam.axis.MjpegFrame;
import net.sf.jipcam.axis.MjpegInputStream;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class streaming extends Thread {

    private URL url;
    change_img change;
    JPanel jPanel;

    streaming(JPanel jPanel) {
        change = new change_img();
        this.jPanel = jPanel;
        this.jPanel.add(change, BorderLayout.CENTER);
    }


    public void run() {

        try {

            url = new URL(DATA.url); //URL 가공


            /* 이미지 페널 등록 */


            try {
                while (true) {

                    MjpegInputStream m = new MjpegInputStream(url.openStream());
                    MjpegFrame f;
                    /* 이미지 가져오기 */
                    while ((f = m.readMjpegFrame()) != null) {
                        change.setImage((BufferedImage) f.getImage());
                    }
                    /* 이미지 있을경우 교체 */

                }

            } catch (IOException e1) {
                e1.printStackTrace();
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}

class change_img extends JPanel {

    private BufferedImage image;

    change_img(){
        setBackground(Color.BLACK);
        //setBackground(new Color(0,3,41));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            double winAspect = (double) getWidth() / (double) getHeight();
            double aspect = (double) image.getWidth() / (double) image.getHeight();

            int x, y, w, h;
            if (winAspect < aspect) {
                w = getWidth();
                h = (int) (w / aspect);
                x = 0;
                y = (getHeight() - h) / 2;
                h += y;
            } else {
                h = getHeight();
                w = (int) (h * aspect);
                y = 0;
                x = (getWidth() - w) / 2;
                w += x;
            }
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);


        }
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        repaint();
    }

}
