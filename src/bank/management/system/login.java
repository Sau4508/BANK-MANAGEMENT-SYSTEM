package bank.management.system ;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame {

    login(){


        super("BANK MANAGEMENT SYSTEM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,7,120,120);
        add(image);

        setLayout(null);
        setSize(850,480);
        setLocation(260,150);
        setVisible(true);
    }
  public  static void main(String[] args) {
        new login();
    }

}
