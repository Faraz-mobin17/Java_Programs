import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;

public class About extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1;
    Font f,f1,f2,f3;
    TextArea t1;
    String s;
    public About() {
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180,430,120,50);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorder(null);
        f3 = new Font("RALEWAY",Font.BOLD,22);
        b1.setFont(f3);
        b1.addActionListener(this);

        f = new Font("RALEWAY",Font.BOLD,180);
        setFont(f);

        s = "ELECTRICITY BILLING SOFTWARE BUIT BY FARAZ\n";
        t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);
        add(t1);

        f1 = new Font("RALEWAY",Font.BOLD,16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();

         t1 = new TextArea();
         l1 = new JLabel("About");
        add(l1);
        l1.setBounds(200,10,180,80);
        l1.setForeground(Color.BLACK);
        l1.setAlignmentX(CENTER_ALIGNMENT);
        l1.setAlignmentY(CENTER_ALIGNMENT);
        f2 = new Font("RALEWAY", Font.BOLD,20);
        l1.setFont(f2);

        setBounds(700,220,500,550);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        dispose();
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
   
}
