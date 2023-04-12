import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Japplet1 extends Applet implements MouseListener, MouseMotionListener {
    String msg = "Mouse events";

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse clicked";
        setBackground(Color.blue);
        showStatus(msg);
        showStatus(msg + " " + e.getX() + "," + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        showStatus("mouse entered : " + e.getX() + "," + e.getY());
        for (int i = 0; i < 100000; i++)
            ;
    }

    public void mouseExited(MouseEvent e) {
        msg = "Mouse exited";
        setBackground(Color.yellow);
        showStatus(msg);
        showStatus(msg + e.getX() + "," + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        setBackground(Color.yellow);
        showStatus(msg);
        showStatus(msg + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        showStatus("mouse released : " + e.getX() + "," + e.getY());
    }

    public void mouseMoved(MouseEvent e) {
        msg = "MOuse moved";
        setBackground(Color.green);
        showStatus(msg);
        showStatus("mouse moved : " + e.getX() + "," + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        msg = "Mouse Dragged";
        setBackground(Color.magenta);
        showStatus(msg);
        showStatus(msg + e.getX() + "," + e.getY());
    }
}

/*
 * <body>
 * <applet code = "Japplet1.class" height = 200 width=200>
 * </applet>
 * </body>
 */
