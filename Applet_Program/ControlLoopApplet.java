import java.awt.*;
import java.applet.*;

public class ControlLoopApplet extends Applet {
    public void paint(Graphics g) {

        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                g.fillOval(90, i * 50 + 10, 50, 50);
                g.setColor(Color.black);
            } else {
                g.drawOval(90, i * 50 + 10, 50, 50);
                g.setColor(Color.red);
            }
        }
    }
}
/*
 * <applet code=ControlLoopApplet width=300 height=300>
 * </applet>
 */