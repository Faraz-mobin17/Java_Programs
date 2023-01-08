import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class StarApplet extends Applet {
    int[] pentagonX = { 260, 498, 407, 113, 22 };
    int[] pentagonY = { 10, 183, 462, 462, 183 };
    int[] startX = { 260, 407, 22, 498, 113, 260 };
    int[] startY = { 10, 462, 183, 183, 462, 10 };

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(pentagonX, pentagonY, 5);
        g.setColor(Color.ORANGE);
        g.drawPolygon(pentagonX, pentagonY, 5);
        g.setColor(Color.RED);
        g.drawPolygon(startX, startY, 6);
    }
}

/*
 * <html>
 * <body>
 * <applet code="StarApplet.class" width="500" height="500"></applet>
 * <body>
 * </html>
 */
