
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEventNew extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0;

	public void init() {
		setBackground(Color.ORANGE);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me) {
		setBackground(Color.DARK_GRAY);
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Clicked";
		repaint();
	}

	public void mouseEntered(MouseEvent me) {
		setBackground(Color.MAGENTA);
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Entered";
		repaint();
	}

	public void mouseExited(MouseEvent me) {
		setBackground(Color.WHITE);
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse Exited";
		repaint();

	}

	public void mousePressed(MouseEvent me) {
		setBackground(Color.MAGENTA);
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse Pressed";
		repaint();
	}

	public void mouseReleased(MouseEvent me) {
		setBackground(Color.GREEN);
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse Released";
		repaint();
	}

	public void mouseDragged(MouseEvent me) {
		setBackground(Color.black);
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Mouse is Dragged";
		showStatus("Dragging mouse at" + mouseX + ", " + mouseY);
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		setBackground(Color.cyan);
		// mouseX=me.getX();
		// mouseY=me.getY();
		// msg="Mouse is Moved";
		showStatus("Moving mouse at" + mouseX + ", " + mouseY);

	}

	public void paint(Graphics g) {
		Font f = new Font("Times New Roman", 2, 50);
		g.setFont(f);
		g.drawString(msg, mouseX, mouseY);
	}

}
/*
 * <applet code="MouseEventNew.class" height=500 width=500>
 * </applet>
 */