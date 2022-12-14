import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javafx.scene.control.CheckBox;

public class Checkboxgroupdemo extends Applet {
    public void init() {
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("cbse", cbg, true);
        Checkbox c2 = new Checkbox("Icse", cbg, false);
        Checkbox c3 = new Checkbox("ib", cbg, false);
        // Checkbox c4 = new CheckBox("state board", cbg, false);
        add(c1);
        add(c2);
        add(c3);
        // add(c4);
    }

    public void paint(Graphics g) {
        g.drawString("Checkbox demo", 100, 100);
    }
}

/*
 * <html>
 * <body>
 * <applet code="Checkboxgroupdemo.class" width="500" height="500"></applet>
 * </body>
 * </html>
 */
