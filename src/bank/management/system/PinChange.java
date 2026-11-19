package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    String pin ;
    JButton b1, b2 ;
    JPasswordField p1, p2 ;

    PinChange(String pin){
        this.pin = pin ;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(340,180,400,35);
        l3.add(label1);


        JLabel label2 = new JLabel("New pin :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(340,210,400,35);
        l3.add(label2);


        p1 = new JPasswordField();
        p1.setBackground(new Color(183, 228, 226));
        p1.setForeground(Color.WHITE);
        p1.setBounds(550,215,200,22);
        p1.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(p1);


        JLabel label3 = new JLabel("Re-Enter New pin :");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(340,240,400,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(183, 228, 226));
        p2.setForeground(Color.WHITE);
        p2.setBounds(550,245,200,22);
        p2.setFont(new Font("Raleway",Font.BOLD,16));
        l3.add(p2);


        b1= new JButton("CHANGE");
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



        setSize(1550,1000);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }





    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2)){

                JOptionPane.showMessageDialog(null,"ENTERED YOUR PIN NOT MATCH");
                return ;
            }

            if(e.getSource()==b1){

                if(p1.getText().isEmpty()){

                    JOptionPane.showMessageDialog(null,"ENTER NEW PIN");
                    return ;

                }
                if(p2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"RE-ENTER NEW PIN");
                    return ;



                }

                conn c = new conn();
                String q1 = "update bank set pin ='"+pin1+"' where pin ='"+pin+"'" ;
                String q2 = "update login set pin ='"+pin1+"' where pin ='"+pin+"'" ;
                String q3 = "update signupThree set pin ='"+pin1+"' where pin ='"+pin+"'" ;

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);


                JOptionPane.showMessageDialog(null,"PIN CHANGE SUCCESSFULLY");
                setVisible(false);
                new main_class(pin);
            } else if (e.getSource()==b2) {

                setVisible(false);
                new main_class(pin);

            }


        }catch (Exception E){

            E.printStackTrace();
        }

    }

    static void main(String[] args) {
        new PinChange("");
    }
}
