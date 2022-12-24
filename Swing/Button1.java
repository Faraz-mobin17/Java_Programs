import javax.swing.*;
import java.awt.*;
public class Button1 {
    public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }
    public void go() {
        // border layout cares about five regions east,west,north,sout and center
        JFrame frame = new JFrame("Simple Program");
        JButton center = new JButton("center");
        JButton east = new JButton("EAST");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        Font bigFont = new Font("Consolas",Font.BOLD,28);
        center.setFont(bigFont);
        east.setFont(bigFont);
        west.setFont(bigFont);
        north.setFont(bigFont);
        south.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

