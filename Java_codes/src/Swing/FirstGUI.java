import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();

    }
}

class Abc extends  JFrame {
    Abc() {

        JLabel l = new JLabel("Hello world");
        JLabel label2 = new JLabel("Hello Faraz");
        add(l);
        add(label2);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


