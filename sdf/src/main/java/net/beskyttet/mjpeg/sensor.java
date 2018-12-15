package net.beskyttet.mjpeg;

import javax.swing.*;
import java.awt.*;

public class sensor extends JPanel{

    void setter(int x, int y, int width, int height){
        Add_img.x = x;
        Add_img.y = y;
        Add_img.width = width;
        Add_img.height = height;
        System.out.println(Add_img.width);
    }

    sensor(JPanel Main_panel) {


        /* 좌측 페널 */
        setter(0,0,100,100);
        Add_img left = new Add_img("C:\\Users\\stck6\\Desktop\\64i58PICYxE_1024.png");
        left.setBackground(new Color(0, 3, 41));
        left.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 250));
        JLabel jLabel = new JLabel("asd");
        left.add(jLabel);

        /* 우측 페널 */
        JPanel right = new JPanel();
        right.setBackground(new Color(0, 3, 41));
        right.setBorder(BorderFactory.createEmptyBorder(0, 250, 0, 0));

        /* 메인 페널에 등록 */
        Main_panel.add(left, BorderLayout.WEST);
        Main_panel.add(right, BorderLayout.EAST);
    }
}
