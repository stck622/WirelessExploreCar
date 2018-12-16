import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends Thread {

    JFrame frame;

    public void run() {

        /* 프레임 생성 */
        frame = new JFrame("Remote Controller");
        frame.setSize(1280, 720);
        frame.setLayout(new BorderLayout());

        /* 창 닫을경우 */
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        /* 메인 페널 생성 */
        JPanel Main_Panel = new JPanel();
        Main_Panel.setLayout(new BorderLayout());

        /* 메인 페널 탑, 바텀 설정 */
        JPanel top = new JPanel();
        top.setBackground(new Color(0,3,41));
        top.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));

        JPanel bottom = new JPanel();
        bottom.setBackground(new Color(0,3,41));
        bottom.setBorder(BorderFactory.createEmptyBorder(60,0,0,0));

        Main_Panel.add(top,BorderLayout.NORTH);
        Main_Panel.add(bottom,BorderLayout.SOUTH);

        /* 메인 페널 좌, 우 센서 설정 */
        new sensor(Main_Panel);

        /* 프레임 바 생성 */
        new top_panel(frame);

        /* 메인 페널 프레임에 등록 */
        frame.add(Main_Panel, BorderLayout.CENTER);

        /* 스트리밍 수신 시작 */
        new streaming(Main_Panel).start();

        frame.setResizable(false);
        frame.setVisible(true);


    }
}
