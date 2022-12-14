import java.awt.*;
import java.applet.*;

public class Graphics extends Applet {
    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        g.drawString("Happy diwali", 40, 50);
        g.drawRect(40, 70, 100, 40);
        g.fillRect(40, 120, 100, 40);
        g.drawOval(40, 170, 30, 60);
        g.fillOval(40, 170, 30, 60);
        g.drawline(40, 240, 140, 240);
        g.drawArc(40, 260, 60, 100, 60, 60);

        int x[] = { 200, 350, 450, 350, 200 };
        int y[] = { 100, 100, 250, 400, 400 };
        g.fillPolygon(x, y, 5);
    }

    private void fillPolygon(int[] x, int[] y, int i) {
    }

    private void drawArc(int i, int j, int k, int l, int m, int n) {
    }

    private void drawline(int i, int j, int k, int l) {
    }

    void fillOval(int i, int j, int k, int l) {
    }

    void drawOval(int i, int j, int k, int l) {
    }

    private void fillRect(int i, int j, int k, int l) {
    }

    private void drawRect(int i, int j, int k, int l) {
    }

    void drawString(String string, int i, int j) {
    }

    public void setColor(Color green) {
    }
}

/*
 * <html>
 * <body>
 * <applet code="Graphics.class" width="500" height="500"></applet>
 * </body>
 * </html>
 */