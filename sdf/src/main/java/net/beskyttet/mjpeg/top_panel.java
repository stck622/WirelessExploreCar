package net.beskyttet.mjpeg;

import javax.swing.*;
import java.awt.*;

public class top_panel {

    top_panel(JFrame frame) {

        /* 탑 페널 설정 */
        JPanel Top_Panel = new JPanel();
        Top_Panel.setBackground(new Color(0,6,76));
        Top_Panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        Top_Panel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));

        /* 탑 페널 text 설정 */
        JLabel jLabel = new JLabel(DATA.url);
        jLabel.setFont(new Font("PLAIN", Font.PLAIN, 25));
        jLabel.setForeground(Color.white);

        /* text 탑 페널에 등록 */
        Top_Panel.add(jLabel);

        /* 프레임에 탑 페널 등록 */
        frame.add(Top_Panel,BorderLayout.NORTH);

    }
}
