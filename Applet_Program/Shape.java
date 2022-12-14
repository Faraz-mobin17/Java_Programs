import java.awt.*;
import java.applet.*;

public class Shape extends Applet {
   public void init() {
      setBackground(Color.red);
      setForeground(Color.black);
   }

   public void paint(Graphics g) {
      g.drawString("Happy Diwali", 40, 50);
      g.drawRect(40, 70, 100, 40);
      g.fillRect(40, 120, 100, 40);
      g.drawOval(40, 170, 30, 60);
      g.fillOval(90, 170, 30, 60);
      g.drawLine(40, 240, 140, 240);
      g.drawArc(40, 260, 60, 100, 60, 60);
      int x[] = { 200, 350, 490, 350, 200 };
      int y[] = { 100, 100, 250, 400, 400 };
      g.fillPolygon(x, y, 5);
   }
}

/*
 * <applet code="Shape.class" width="500" height="500">
 * </applet>
 */