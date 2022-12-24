import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInput {
    public static void main(String[] args) {
        RadioDemo r = new RadioDemo();
    }
}
class RadioDemo extends JFrame implements ActionListener, ItemListener {
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    JCheckBox c1,c2;
    public RadioDemo() {
        t1 = new JTextField(20);
        b = new JButton("OK");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        l = new JLabel("Greetings");
        c1 = new JCheckBox("Chomu");
        c2 = new JCheckBox("Dholak");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);
        b.addActionListener(this);
        c1.addItemListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        String name = t1.getText();
        if (r1.isSelected()) {
            name = "Mr. " + name;
        } else {
            name = "Ms. " + name;
        }
        if (c1.isSelected()) {
            name = name + " is a Chomu";
        }
        if (c2.isSelected()) {
            name = name + " is a Dholak";
        }
    l.setText(name + "");
    }
    public void itemStateChanged(ItemEvent ie) {
        System.out.println("Dancer");
    }
}
