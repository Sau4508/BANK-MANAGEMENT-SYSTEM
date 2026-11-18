package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6 , b7 ;
    String pin ;

    main_class(String pin){
        this.pin = pin ;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(390,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("Deposit");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,125));
        b1.setBounds(300,270,200,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("Cash Withdrawl");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,125));
        b2.setBounds(300,315,200,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,125));
        b3.setBounds(300,360,200,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("Exit");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,125));
        b4.setBounds(685,405,200,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN Change");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,125));
        b5.setBounds(685,270,200,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,125));
        b6.setBounds(685,315,200,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("Mini-Statement");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,125));
        b7.setBounds(685,360,200,35);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
   setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource()==b4){

            System.exit(0);

//            setVisible(false);
//            new login();
        }
        else if(e.getSource()==b2){
            new withdrawal(pin);
            setVisible(false);
        } else if(e.getSource()==b6){
            new BalanceEnquiry(pin);
            setVisible(false);
        }else if(e.getSource()==b3){
            new FastCash(pin);
            setVisible(false);
        }

    }

    static void main(String[] args) {
        new main_class("");
    }
}
