package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawal extends JFrame implements ActionListener {
    String pin ;

    TextField textField ;
    JButton b1,b2 ;

    withdrawal(String pin){

        this.pin = pin ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("Please Enter Your Amount");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,18));
        label1.setBounds(440,180,400,35);
        l3.add(label1);


        JLabel label2 = new JLabel("(Maximum Withdrawal is RS.10000)");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,10));
        label2.setBounds(450,200,400,30);
        l3.add(label2);


        textField = new TextField();
        textField.setBackground(new Color(183, 228, 226));
        textField.setForeground(Color.WHITE);
        textField.setBounds(440,235,320,22);
        textField.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(textField);

        b1= new JButton("WITHDRAWAL");
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

        if(e.getSource()==b1) {

            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawal");

                } else {
                    conn c = new conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {

                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {

                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {

                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + date + "','withdrawal','" + amount + "','" + pin + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + "debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception E) {

            }
        } else if (e.getSource()==b2) {

            setVisible(false);
            new main_class(pin);

        }


    }




    static void main(String[] args) {
        new withdrawal("");
    }
}
