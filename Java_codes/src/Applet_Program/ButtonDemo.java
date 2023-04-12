import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Applet implements ActionListener {

    public void init() {
        Button b1 = new Button("DARK_GRAY");
        Button b2 = new Button("MAGENTA");
        Button b3 = new Button("pink");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("A Program to show button demo", 100, 100);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("DARK_GRAY")) {
            setBackground(Color.DARK_GRAY);
        } else if (str.equals("MAGENTA")) {
            setBackground(Color.MAGENTA);
        } else {
            setBackground(Color.pink);
        }
    }

}

/*
 * <html>
 * <body>
 * <applet code="ButtonDemo.class" width="500" height="500"></applet>
 * </body>
 * </html>
 */