import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class AppletEventHandling extends Applet implements MouseListener {
    StringBuffer strBuf;

    public void init() {
        addMouseListener(this);
        strBuf = new StringBuffer();
        addItem("initialize the applet");
        addItem("welcome my frnds welcome");
    }

    public void start() {
        addItem("start");
    }

    public void stop() {
        addItem("Stop");
    }

    public void destroy() {
        addItem("Destroy");
    }

    void addItem(String word) {
        System.out.println(word);
        strBuf.append(word);
        repaint();
    }

    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", 3, 40);
        g.setFont(f);
        g.drawString(strBuf.toString(), 20, 200);
        setForeground(Color.blue);
        setBackground(Color.green);
    }

    public void MouseEntered(MouseEvent event) {

    }

    public void mouseExited(MouseEvent event) {

    }

    public void mousePressed(MouseEvent event) {

    }

    public void mouseReleased(MouseEvent event) {

    }

    public void mouseClicked(MouseEvent event) {
        addItem("Mouse is clicked!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}

/*
 * <applet code="AppletEventHandling.class" width="800" height="500"></applet>
 */