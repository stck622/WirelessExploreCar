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
        setter(-10,0,150,200);
        JPanel left = new JPanel();
        left.setBackground(new Color(0, 3, 41));
        left.setBackground(Color.white);
        left.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        JLabel jLabel = new JLabel("asd");
        Add_img temp1 = new Add_img("C:\\Users\\stck6\\Desktop\\64i58PICYxE_1024.png");
        temp1.setBackground(Color.red);
        temp1.setLayout(new BorderLayout());
        jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 0));
        temp1.add(jLabel,BorderLayout.SOUTH);
        left.add(temp1);
        Add_img temp2 = new Add_img("C:\\Users\\stck6\\Desktop\\64i58PICYxE_1024.png");
        temp2.setBackground(Color.blue);
        left.add(temp2);
        left.setLayout(new GridLayout(1,2));
        temp1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 125));
        temp2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 125));



        /* 우측 페널 */
        JPanel right = new JPanel();
        right.setBackground(new Color(0, 3, 41));
        right.setBorder(BorderFactory.createEmptyBorder(0, 250, 0, 0));

        /* 메인 페널에 등록 */
        Main_panel.add(left, BorderLayout.WEST);
        Main_panel.add(right, BorderLayout.EAST);
    }
}
