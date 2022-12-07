package AppletExample;

import java.awt.*;
import java.applet.*;

public class ApplletExample extends Applet {
    public void init() {
        setBackground(Color.blue);
        setForeground(Color.red);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        Font f = new Font("Times new Roman", 2, 40);
        g.setFont(f);
        g.drawString("Welcome to java Applet 3", 100, 240);
        g.drawString("Welcome to java Applet 2", 100, 200);
        g.drawString("Welcome to java Applet 1", 100, 160);
    }
}
