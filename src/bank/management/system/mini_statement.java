package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class mini_statement extends JFrame implements ActionListener {

    String pin ;
    JButton button ;

    mini_statement(String pin){
        this.pin = pin ;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(500,600);
        setLocation(20,20);
        setLayout(null);


        JLabel label1 = new JLabel() ;
        label1.setFont(new Font("System",Font.BOLD,15));
       label1.setBounds(20,80,400,350);
        add(label1);

        JLabel label2 = new JLabel("Siddharth Bank ") ;
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel() ;
        label3.setFont(new Font("System",Font.BOLD,15));
        label3.setBounds(20,50,300,20);
        add(label3);

        JLabel label4 = new JLabel() ;
        label4.setFont(new Font("System",Font.BOLD,15));
        label4.setBounds(20,460,300,20);
        add(label4);


        try {

            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number :"+resultSet.getString("card_number").substring(0,4)+"XXXXXXXXXXXX"+resultSet.getString("card_number").substring(12));

            }

        }catch (Exception e){

            e.printStackTrace();
        }

        try {

            int balance = 0 ;
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){

               label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                if(resultSet.getString("type").equals("Deposit")){

                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }

            label4.setText("your total balance is Rs."+balance);




        }catch(Exception e){

            e.printStackTrace();
        }
button = new JButton("EXIT");
        button.setBounds(20,500,100,20);
        button.addActionListener(this);
        button.setBackground(Color.black);
        button.setForeground(Color.WHITE);
        add(button);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);

    }

    static void main(String[] args) {

        new mini_statement("");

    }
}
