package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    JButton next ;
    JRadioButton r1,r2 ,r3,r4 ;

    JTextField textName ,textFName ,textEmail ,textAD , textCity ,textPin , textState;

    JDateChooser dateChooser ;

    Random random_number = new Random();
    long first4 = (random_number.nextLong() %9000L) +1000L ;
    String first = " " + Math.abs(first4);

    Signup(){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,3,120,120);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO. : "+ first);
        label1.setBounds(220,40,600,40);
        label1.setFont(new Font("raleway",Font.BOLD,25));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("raleway",Font.BOLD,20));
        label2.setBounds(355,80,600,30);
        add(label2) ;

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("raleway",Font.BOLD,20));
        label3.setBounds(310,105,600,30);
        add(label3) ;

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("raleway",Font.BOLD,15));
        labelName.setBounds(80,160,50,50);
        add(labelName);

        textName = new JTextField(15);
        textName.setForeground(Color.gray);
        textName.setBounds(240,175,500,25);
        textName.setFont(new Font("Arial",Font.BOLD,15));
        add( textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("raleway",Font.BOLD,15));
        labelFName.setBounds(80,195,150,50);
        add(labelFName);

        textFName = new JTextField(15);
        textFName.setForeground(Color.gray);
        textFName.setBounds(240,210,500,25);
        textFName.setFont(new Font("Arial",Font.BOLD,15));
        add( textFName);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setFont(new Font("raleway",Font.BOLD,15));
        DOB.setBounds(80,235,150,50);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(240,250,500,25);
        add(dateChooser);


        JLabel label8 =  new JLabel("Email :");
        label8.setFont(new Font("raleway",Font.BOLD,15));
        label8.setBounds(80,275,200,50);
        add(label8);

        textEmail = new JTextField(15);
        textEmail.setForeground(Color.gray);
        textEmail.setBounds(240,285,500,25);
        textEmail.setFont(new Font("Arial",Font.BOLD,15));
        add( textEmail);


        JLabel label6 =  new JLabel("Gender :");
        label6.setFont(new Font("raleway",Font.BOLD,15));
        label6.setBounds(80,325,200,50);
        add(label6);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(250, 237, 205));
        r1.setFont(new Font("raleway",Font.BOLD,15));
        r1.setBounds(240,325,90,50);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(250, 237, 205));
        r2.setFont(new Font("raleway",Font.BOLD,15));
        r2.setBounds(450,325,90,50);
        add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);




        JLabel label7 =  new JLabel("Marital Status:");
        label7.setFont(new Font("raleway",Font.BOLD,15));
        label7.setBounds(80,360,200,50);
        add(label7);

        r3 = new JRadioButton("Married");
        r3.setBackground(new Color(250, 237, 205));
        r3.setFont(new Font("raleway",Font.BOLD,15));
        r3.setBounds(240,360,90,50);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBackground(new Color(250, 237, 205));
        r4.setFont(new Font("raleway",Font.BOLD,15));
        r4.setBounds(450,360,130,50);
        add(r4);


        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r4);
        buttonGroup2.add(r4);


        JLabel label9 =  new JLabel("Address :");
        label9.setFont(new Font("raleway",Font.BOLD,15));
        label9.setBounds(80,405,200,25);
        add(label9);

        textAD = new JTextField(15);
        textAD.setForeground(Color.gray);
        textAD.setBounds(240,410,500,25);
        textAD.setFont(new Font("Arial",Font.BOLD,15));
        add( textAD);



        JLabel labelCity =  new JLabel("City :");
        labelCity.setFont(new Font("raleway",Font.BOLD,15));
        labelCity.setBounds(80,450,200,25);
        add(labelCity);

        textCity = new JTextField(15);
        textCity.setForeground(Color.gray);
        textCity.setBounds(240,450,500,25);
        textCity.setFont(new Font("Arial",Font.BOLD,15));
        add(textCity);



        JLabel labelPin =  new JLabel("Pin Code :");
        labelPin.setFont(new Font("raleway",Font.BOLD,15));
        labelPin.setBounds(80,490,200,25);
        add(labelPin);

        textPin = new JTextField(15);
        textPin.setForeground(Color.gray);
        textPin.setBounds(240,490,500,25);
        textPin.setFont(new Font("Arial",Font.BOLD,15));
        add(textPin);


        JLabel labelState =  new JLabel("State :");
        labelState.setFont(new Font("raleway",Font.BOLD,15));
        labelState.setBounds(80,525,200,25);
        add(labelState);

        textState = new JTextField(15);
        textState.setForeground(Color.gray);
        textState.setBounds(240,525,500,25);
        textState.setFont(new Font("Arial",Font.BOLD,15));
        add(textState);

        next = new JButton("next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(640,600,80,29);
        add(next);


        getContentPane().setBackground(new Color(250, 237, 205));
        setLayout(null);
        setSize(850,700);
        setLocation(250,20);
        setVisible(true);

    }


    static void main(String[] args) {


        new Signup();
    }
}
//254, 250, 224
//233, 237, 201
//204, 213, 174