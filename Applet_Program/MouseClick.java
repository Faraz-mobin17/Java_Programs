import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseClick extends Frame implements MouseListener {
	MouseClick() {
		addMouseListener(this);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(e.getX(), e.getY(), 50, 50);
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public static void main(String args[]) {
		new MouseClick();
	}

}
