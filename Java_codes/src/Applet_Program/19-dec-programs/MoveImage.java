import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

import javafx.scene.input.KeyEvent;

public class MoveImage {
    public static void main(String[] args) {
        new MyFrame1();
    }
}

class MyFrame1 extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon = new ImageIcon("rocket.jpg");

    MyFrame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        // icon = new ImageIcon("rocket.jpg");
        label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setIcon(icon);
        // laebl.setBackground(Color.red);
        // label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);

        this.setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked when a key is typed. Uses keyChar char output
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        // keyPressed = Invoked when a physical key is pressed down uses keycode, int
        // output
        int code = e.getKeyCode();
        switch (code) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        // keyReleased = called whenever a button is releaesd
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}