import java.swing.*;

import javax.swing.JFrame;

public class DragImage {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();

    MyFrame() {
        this.add(DragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}