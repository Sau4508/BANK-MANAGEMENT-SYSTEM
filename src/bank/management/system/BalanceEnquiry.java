package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin ;
    JButton b1 ;
    JLabel label2 ;


    BalanceEnquiry(String pin){
        this.pin = pin ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Rs.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,18));
        label1.setBounds(410,180,400,35);
        l3.add(label1);


        label2 = new JLabel("()");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,10));
        label2.setBounds(410,200,400,30);
        l3.add(label2);




        b1= new JButton("BACK");
        b1.setFont(new Font("Raleway",Font.BOLD,15));
        b1.setBackground(new Color(183, 228, 226));
        b1.setForeground(Color.WHITE);
        b1.setBounds(720,362,150,30);
        b1.addActionListener(this);
        l3.add(b1) ;

        int balance = 0;

        try {

            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" +pin+ "'");

            while (resultSet.next()) {

                if(resultSet.getString("type").equals("Deposit")){

                    balance +=Integer.parseInt(resultSet.getString("amount"));
                }else{

                    balance -=Integer.parseInt(resultSet.getString("amount"));
                }
        }

        }catch (Exception e){

            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
