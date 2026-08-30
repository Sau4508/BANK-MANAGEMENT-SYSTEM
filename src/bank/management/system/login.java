package bank.management.system ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JLabel label1 ,label2,label3 ;
     JTextField textFeild1 ;

     JPasswordField passwordField1 ;

     JButton button1,button2,button3 ;

    login(){


        super("BANK MANAGEMENT SYSTEM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,7,120,120);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card1.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(30,345,120,120);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setFont(new Font("AvantGrade",Font.BOLD,30));
        label1.setBounds(280,110,450,40);
        add(label1);

        label2 = new JLabel("Card No :");
        label2.setFont(new Font("Railway",Font.BOLD,25));
        label2.setBounds(250,190,370,30);
        add(label2);


        textFeild1 = new JTextField(15);
        textFeild1.setForeground(Color.gray);
        textFeild1.setBounds(380,195,200,25);
        textFeild1.setFont(new Font("Arial",Font.BOLD,15));
        add(textFeild1);


        label3 = new JLabel("Pin code :");
        label3.setFont(new Font("Railway",Font.BOLD,25));
        label3.setBounds(250,230,370,30);
        add(label3);


        passwordField1 = new JPasswordField(15);
        passwordField1.setForeground(Color.gray);
        passwordField1.setBounds(380,235,200,25);
        passwordField1.setFont(new Font("Arial",Font.BOLD,15));
        add(passwordField1);


        button1 =new JButton("Sign In");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.black);
        button1.setBounds(380,280,90,22);
        button1.addActionListener(this);
        add(button1);

        button2 =new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.black);
        button2.setBounds(485,280,90,22);
        button2.addActionListener(this);
        add(button2);


        button3 =new JButton("sign up");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.black);
        button3.setBounds(380,320,200,22);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg1.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(260,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() ==button1){

            }
            else if(e.getSource() ==button2){

            textFeild1.setText("") ;
            passwordField1.setText("");
            }

            else if(e.getSource() ==button3){

            }
        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public  static void main(String[] args) {
        new login();
    }

}
