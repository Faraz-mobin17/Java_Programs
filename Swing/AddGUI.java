import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddGUI {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame implements  ActionListener {

    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3;
    public Addition() {
         t1 = new JTextField(20);
         t2 = new JTextField(20);
         t3 = new JTextField(20);
         b1 = new JButton("Calculate");


         l1 = new JLabel("Result");
         l2 = new JLabel("Enter First Number:");
        l3 = new JLabel("Enter Second Number:");
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(t3);
        add(b1);

        add(l1);
// action listener is an interface that's why we are passing this to create an object of super class that is addition
        b1.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        String operator = t3.getText();
        int value = 0;
        switch (operator) {
            case "+":
                 value = a + b;
                l1.setText(value + "");
                break;
            case "-":
                 value = a - b;
                l1.setText(value + "");
                break;
            case "*":
                 value = a * b;
                l1.setText(value + "");
                break;
            case "/":
                 value = a / b;
                l1.setText(value + "");
                break;
            default:
                l1.setText("Not a correct operator");
        }

    }
}