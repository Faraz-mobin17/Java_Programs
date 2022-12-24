import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDemo {
    public static void main(String[] args) {
        MouseDemoShow obj = new MouseDemoShow();
    }
}
class MouseDemoShow extends JFrame  {
    public MouseDemoShow() {
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println(x + " " + y);
            }

        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}