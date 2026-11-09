package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {


    JRadioButton r1,r2 , r3, r4 ;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c ;
    String formno ;


    signup3(String formno){

        this.formno = formno ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60,2,120,120);
        add(image);



        JLabel l1 = new JLabel("page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,20));
        l1.setBounds(320,30,200,40);
        add(l1);


        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,20));
        l2.setBounds(280,60,200,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(100,160,200,40);
        add(l3);


r1 = new JRadioButton("Saving Account");
r1.setFont(new Font("Raleway",Font.BOLD,12));
r1.setBackground(new Color(229, 219, 164));
r1.setBounds(100,200,200,30);
add(r1);

r2 = new JRadioButton("Fixed Deposit Account");
r2.setFont(new Font("Raleway",Font.BOLD,12));
r2.setBackground(new Color(229, 219, 164));
r2.setBounds(300,200,200,30);
add(r2);

r3 = new JRadioButton("Current Account");
r3.setFont(new Font("Raleway",Font.BOLD,12));
r3.setBackground(new Color(229, 219, 164));
r3.setBounds(100,240,200,30);
add(r3);

r4 = new JRadioButton("Recurring  Deposit Account");
r4.setFont(new Font("Raleway",Font.BOLD,12));
r4.setBackground(new Color(229, 219, 164));
r4.setBounds(300,240,200,30);
add(r4);


ButtonGroup buttonGroup = new ButtonGroup();
buttonGroup.add(r1);
buttonGroup.add(r2);
buttonGroup.add(r3);
buttonGroup.add(r4);


        JLabel l4 = new JLabel("Card Number");
        l4.setFont(new Font("Raleway",Font.BOLD,15));
        l4.setBounds(100,280,200,20);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digits Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,300,200,15);
        add(l5);


        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-2342");
        l6.setFont(new Font("Raleway",Font.BOLD,15));
        l6.setBounds(300,280,250,20);
        add(l6);


        JLabel l7 = new JLabel("(It would appear on atm/cheque Book and Statement)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(300,300,400,15);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,15));
        l8.setBounds(100,340,200,20);
        add(l8);

        JLabel l9 = new JLabel("(4-digit Password)");
        l9.setFont(new Font("Raleway",Font.BOLD,12));
        l9.setBounds(100,360,200,15);
        add(l9);


        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Raleway",Font.BOLD,15));
        l10.setBounds(300,340,200,20);
        add(l10);


        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,15));
        l11.setBounds(100,400,200,15);
        add(l11);


        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(229, 219, 164));
        c1.setFont(new Font("Raleway",Font.BOLD,13));
        c1.setBounds(100,430,200,15);
        add(c1);


        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(229, 219, 164));
        c2.setFont(new Font("Raleway",Font.BOLD,13));
        c2.setBounds(300,430,200,15);
        add(c2);


        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(229, 219, 164));
        c3.setFont(new Font("Raleway",Font.BOLD,13));
        c3.setBounds(100,450,200,15);
        add(c3);


        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(229, 219, 164));
        c4.setFont(new Font("Raleway",Font.BOLD,13));
        c4.setBounds(300,450,200,15);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(229, 219, 164));
        c5.setFont(new Font("Raleway",Font.BOLD,13));
        c5.setBounds(100,470,200,15);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(229, 219, 164));
        c6.setFont(new Font("Raleway",Font.BOLD,13));
        c6.setBounds(300,470,200,15);
        add(c6);


        JCheckBox c7 = new JCheckBox("I here by declares that the abouse entered deatils correct to the best of my knowledge.",true);
        c7.setBackground(new Color(229, 219, 164));
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBounds(100,510,600,15);
        add(c7);


        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,15));
        l12.setBounds(700,20,160,25);
        add(l12);

        JLabel l13 = new JLabel();
        l13.setFont(new Font("Raleway",Font.BOLD,15));
        l13.setBounds(760,10,60,25);
        add(l13);


        c= new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,15));
        c.setBackground(new Color(183, 228, 226));
        c.setBounds(400,570,150,25);
        c.addActionListener(this);
        add(c) ;


        s= new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,15));
        s.setBackground(new Color(178, 237, 235));
        s.setBounds(590,570,150,25);
        s.addActionListener(this);
        add(s) ;




        setLayout(null);
        setSize(850,750);
        setLocation(180,80);
        getContentPane().setBackground(new Color(229, 219, 164));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String Account_Type = null;
        if (r1.isSelected()) {
            Account_Type = "Saving Account";

        } else if (r2.isSelected()) {

            Account_Type = "Fixed Deposit Account";
        } else if (r3.isSelected()) {

            Account_Type = "Current Account";
        } else if (r4.isSelected()) {

            Account_Type = "Recurring  Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String card_no = " " + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = " " + Math.abs(first3);


        String Services_Required = "";
        if (c1.isSelected()) {

            Services_Required += "ATM CARD";

        } else if (c2.isSelected()) {

            Services_Required += "Internet Banking";

        } else if (c3.isSelected()) {

            Services_Required += "Mobile Banking";

        } else if (c4.isSelected()) {

            Services_Required += "Email Alerts";

        } else if (c5.isSelected()) {

            Services_Required += "Cheque Book";

        } else if (c6.isSelected()) {

            Services_Required += "E-Statement";

        }

        try {
            if (e.getSource() == s) {

                if (Account_Type.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "fill all the field");
                } else {
                    conn c1 = new conn();
                    String q1 = "insert into signupThree values('" + formno + "','" + Account_Type + "','" + card_no + "','" + pin + "','" + Services_Required + "')";
                    String q2 = "insert into login values('" + formno + "','" + card_no + "' ,'" + pin + "')";

                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card number :"+card_no+"\n pin :"+pin);
                    setVisible(false);
                }


            } else if (e.getSource()==c) {
                System.exit(0);

            }


        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    static void main(String[] args) {
        new signup3("") ;
    }
}
