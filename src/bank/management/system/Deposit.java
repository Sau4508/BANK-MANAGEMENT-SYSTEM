package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Deposit extends JFrame implements ActionListener {
    String pin ;

    TextField textField ;
    JButton b1,b2 ;
    Deposit(String pin){
        this.pin = pin ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel l3 = new JLabel(i3);
                l3.setBounds(0,0,1550,830);
                add(l3);

                JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
                label1.setForeground(Color.WHITE);
                label1.setFont(new Font("System",Font.BOLD,16));
                label1.setBounds(440,180,400,35);
                l3.add(label1);


                textField = new TextField();
                textField.setBackground(new Color(183, 228, 226));
                textField.setForeground(Color.WHITE);
                textField.setBounds(440,230,320,22);
                textField.setFont(new Font("Raleway",Font.BOLD,16));
                l3.add(textField);


        b1= new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBackground(new Color(183, 228, 226));
        b1.setForeground(Color.WHITE);
        b1.setBounds(720,362,150,30);
        b1.addActionListener(this);
        l3.add(b1) ;


        b2= new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.BOLD,15));
        b2.setBackground(new Color(183, 228, 226));
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,410,150,30);
        b2.addActionListener(this);
        l3.add(b2) ;



                setLayout(null);
          setSize(1550,1000);
          setLocation(0,0);
         setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        try {


            String amount = textField.getText();
            Date date = new Date();

            if (e.getSource() == b1) {
                if (textField.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to deposit");
                } else {

                    conn c = new conn();
                    c.statement.executeUpdate("insert into Bank values('" + date + "','Deposit','" + amount + "','" + pin + "')");
                    JOptionPane.showMessageDialog(null, "RS. " + amount + " deposit successfully ");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_class(pin);
            }
        } catch (Exception E) {

            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }

}
