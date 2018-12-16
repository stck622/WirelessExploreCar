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
        JPanel left = new JPanel();
        left.setBackground(new Color(0, 3, 41));
        left.setBackground(Color.white);
        left.setLayout(new GridLayout(1,2));

        /* 온도 센서 패널 */
        setter(-10,0,150,200);
        Add_img temp_panel = new Add_img("C:\\Users\\stck6\\Desktop\\64i58PICYxE_1024.png");
        temp_panel.setBackground(Color.red);
        temp_panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 125));
        temp_panel.setLayout(new BorderLayout());
        left.add(temp_panel);

        /* 온도 센서 라벨 */
        JLabel temp_label = new JLabel("asd");
        temp_label.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 0));
        temp_panel.add(temp_label,BorderLayout.SOUTH);

        /* 습도 센서 패널 */
        setter(-10,0,150,200);
        Add_img humi_panel = new Add_img("C:\\Users\\stck6\\Desktop\\64i58PICYxE_1024.png");
        humi_panel.setBackground(Color.blue);
        humi_panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 125));
        humi_panel.setLayout(new BorderLayout());
        left.add(humi_panel);

        /* 습도 센서 라벨 */
        JLabel humi_label = new JLabel("asd");
        humi_label.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 0));
        humi_panel.add(humi_label,BorderLayout.SOUTH);

        /* 우측 페널 */
        JPanel right = new JPanel();
        right.setBackground(new Color(0, 3, 41));
        right.setBorder(BorderFactory.createEmptyBorder(0, 250, 0, 0));

        /* 메인 페널에 등록 */
        Main_panel.add(left, BorderLayout.WEST);
        Main_panel.add(right, BorderLayout.EAST);
    }
}
