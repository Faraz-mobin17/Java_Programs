import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javafx.scene.control.CheckBox;

public class Checkboxdemo extends Applet {
    public void init() {
        Checkbox c1 = new Checkbox("singing");
        Checkbox c2 = new Checkbox("cycling");
        Checkbox c3 = new Checkbox("swimming");
        Checkbox c4 = new Checkbox("para jumping");
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }

    public void paint(Graphics g) {
        g.drawString("Checkbox DEMO", 100, 100);
    }
}

/*
 * <html>
 * <body>
 * <applet code="Checkboxdemo.class" width="500" height="500"></applet>
 * </body>
 * </html>
 */