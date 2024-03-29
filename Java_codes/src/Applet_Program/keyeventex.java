import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class keyeventex extends Applet implements KeyListener {
	int x = 150, y = 150;
	String msg = "Key Event";

	public void init() {
		setBackground(Color.black);
		setForeground(Color.white);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke) {
		msg = "Key pressed";
		setBackground(Color.MAGENTA);
		showStatus("Key Pressed");
		repaint();
	}

	public void keyReleased(KeyEvent ke) {
		msg = "Key Released";
		setBackground(Color.PINK);
		showStatus("Key Released");
		repaint();
	}

	public void keyTyped(KeyEvent ke) {
		msg = "Key typed";
		msg += ke.getKeyChar();
		setBackground(Color.LIGHT_GRAY);
		showStatus("Key Typed");
		repaint();
	}

	public void paint(Graphics g) {
		Font f = new Font("Consolas", 2, 50);
		g.setFont(f);
		g.drawString(msg, x, y);
	}

}

/*
 * <applet code="keyeventex.class" width=600 height=600>
 * </applet>
 */